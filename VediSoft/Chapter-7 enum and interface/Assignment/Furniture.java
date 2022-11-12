import java.util.Scanner;

enum Material {
    Iron, Steel, Wooden;

    public static Material acceptMaterial() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if (str.trim().toLowerCase().equals("iron"))
            return Iron;
        else if (str.trim().toLowerCase().equals("steel"))
            return Steel;
        else
            return Wooden;
    }
}

enum FurnitureType {
    Chair, Table, Bed;

    public static FurnitureType acceptType() {
        Scanner on = new Scanner(System.in);
        String str = on.nextLine();

        if (str.trim().toLowerCase().equals("chair"))
            return Chair;
        else if (str.trim().toLowerCase().equals("table"))
            return Table;
        else
            return Bed;
    }
}

class Furniture {
    protected int modelNo;
    protected String modelName;
    protected String modelDescription;
    protected Material material;
    protected FurnitureType type;

    public Furniture() {
        modelName = new String();
        modelDescription = new String();

        material = Material.Iron;
    }

    public Furniture(int modelNo, String modelName, String modelDescription, Material material, FurnitureType type) {
        this.modelNo = modelNo;
        this.modelName = modelName;
        this.modelDescription = modelDescription;
        this.material = material;
        this.type = type;
    }

    public void acceptData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Furniture Model Name : ");
        modelName = in.nextLine();
        System.out.println("Enter Furniture Model Number : ");
        modelNo = in.nextInt();
        in.nextLine();
        System.out.println("Enter Furniture Model Description : ");
        modelDescription = in.nextLine();
        System.out.println("Enter Furniture Material : ");
        material = Material.acceptMaterial();
        System.out.println("Enter Furniture Type : ");
        type = FurnitureType.acceptType();
    }

    public void showData() {
        System.out.println("Furniture Model Number : " + modelNo);
        System.out.println("Furniture Model Name : " + modelName);
        System.out.println("Furniture Model Description : " + modelDescription);
        System.out.println("Furniture Material : " + material);
        System.out.println("Furniture Type : " + type);
    }

    public static void main(String args[]) {
        Furniture f = new Furniture();
        f.acceptData();
        f.showData();
    }
}
