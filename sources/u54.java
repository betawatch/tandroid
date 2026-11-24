// default package

import android.media.MediaFormat;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class u54 implements sac, xc8 {
    public sac a;
    public u54 b;

    public final void a() {
        u54 u54Var = this.b;
        if (u54Var != null) {
            u54Var.a();
        }
    }

    public final void b() {
        u54 u54Var = this.b;
        if (u54Var != null) {
            u54Var.b();
        }
    }

    @Override // sac
    public final void c(long j, long j2, fm4 fm4Var, MediaFormat mediaFormat) {
        sac sacVar = this.a;
        if (sacVar != null) {
            sacVar.c(j, j2, fm4Var, mediaFormat);
        }
    }

    @Override // xc8
    public final void d(int i, Object obj) {
        if (i == 7) {
            this.a = (sac) obj;
            return;
        }
        if (i == 8) {
            this.b = (u54) obj;
        } else {
            if (i != 10000 || obj == null) {
                return;
            }
            fyb.g();
        }
    }
}
