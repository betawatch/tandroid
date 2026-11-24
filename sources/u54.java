// default package

import android.media.MediaFormat;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
