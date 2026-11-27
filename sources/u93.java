// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class u93 extends w01 {
    public boolean shouldBeSkipped;
    public int skippedOutputBufferCount;
    public long timeUs;

    @Override // w01
    public void clear() {
        super.clear();
        this.timeUs = 0L;
        this.skippedOutputBufferCount = 0;
        this.shouldBeSkipped = false;
    }

    public abstract void release();
}
