package xf;

import a4.w;
import java.io.IOException;
import java.util.ArrayDeque;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.zn0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h implements zn0 {
    public final Object a;

    public h() {
        this.a = new ArrayDeque(16);
    }

    @Override // org.telegram.ui.Components.zn0
    public void W(float f9, boolean z10) {
        i iVar = (i) this.a;
        float f10 = iVar.b;
        float z11 = com.google.android.recaptcha.internal.a.z(iVar.c, f10, f9, f10);
        iVar.d = z11;
        if (z10) {
            q6 q6Var = iVar.e;
            q6Var.getClass();
            q6Var.b(null, z11);
        }
        iVar.invalidate();
    }

    public void a() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + c());
    }

    public void b(long j10) {
        long c3 = c();
        if (c3 != j10) {
            if (c3 != -1) {
                if (c3 != -2) {
                    return;
                } else {
                    c3 = -2;
                }
            }
            StringBuilder r6 = w.r(j10, "expected non-string scope or scope ", " but found ");
            r6.append(c3);
            throw new IOException(r6.toString());
        }
    }

    public long c() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // org.telegram.ui.Components.zn0
    public CharSequence getContentDescription() {
        i iVar = (i) this.a;
        float f9 = iVar.b;
        return String.valueOf(Math.round((iVar.a.getProgress() * (iVar.c - f9)) + f9));
    }

    @Override // org.telegram.ui.Components.zn0
    public /* synthetic */ int k0() {
        return 0;
    }

    public h(i iVar) {
        this.a = iVar;
    }

    @Override // org.telegram.ui.Components.zn0
    public void v() {
    }
}
