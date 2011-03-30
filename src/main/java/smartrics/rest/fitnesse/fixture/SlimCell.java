package smartrics.rest.fitnesse.fixture;


public class SlimCell implements CellWrapper<String> {

    private String original;
    private String cell;

	public SlimCell(String c) {
        this.original = c;
        this.cell = c;
	}

	@Override
	public String text() {
        return cell;
	}

	@Override
	public void body(String string) {
        cell = string;
	}

	@Override
	public String body() {
        return cell;
	}

	@Override
	public void addToBody(String string) {
        cell = cell + string;
	}

	@Override
    public String getWrapped() {
		return cell;
	}

    public String getOriginal() {
        return original;
    }

    @Override
    public String toString() {
        return "SlimCell[\n  original:'" + original + "',\n      cell:'" + cell + "'\n]";
    }
}