package ve;

import w7.j8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class k extends df.c {
    public final /* synthetic */ int g;
    public final String h;
    public final String i;

    public /* synthetic */ k(int i10, String str, String str2) {
        this.g = i10;
        this.h = str;
        this.i = str2;
    }

    @Override // df.c
    public final void a(j8 j8Var) {
        switch (this.g) {
            case 0:
                j8Var.i(this);
                break;
            default:
                j8Var.s(this);
                break;
        }
    }

    @Override // df.c
    public final String f() {
        switch (this.g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.i;
            default:
                return "destination=" + this.h + ", title=" + this.i;
        }
    }
}
