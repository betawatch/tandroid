package ve;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class a extends df.c {
    @Override // df.c
    public final void e(df.c cVar) {
        if (!(cVar instanceof a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.b = cVar;
    }
}
