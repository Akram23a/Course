package tpju.course;

public class RefactoringMotoTest {
    private final Moto moto;

    public RefactoringMotoTest(Moto moto) {
        this.moto = moto;
    }

    /**
     * function returns object infos
     */
    public String toString_w_rider() {
        return moto.toString() + " | " + moto.getMyRider().toString();
    }
}
