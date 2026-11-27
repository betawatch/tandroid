// default package

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z86 implements s69, jcc {
    public final /* synthetic */ b58 a;

    public /* synthetic */ z86(b58 b58Var) {
        this.a = b58Var;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        int i2;
        int i3;
        int i4;
        b58 b58Var = this.a;
        gu guVar = b58Var.c;
        ArrayList arrayList = b58Var.r;
        n96 n96Var = ((l96) view).f;
        int i5 = b58Var.O;
        int currentTime = ConnectionsManager.getInstance(i5).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= n96Var.f.size()) {
                break;
            }
            m96 m96Var = (m96) n96Var.f.get(i7);
            long j = m96Var.g;
            if (j > 0 && currentTime - m96Var.d <= eg5.b(i5, (int) j, 0)) {
                hashSet.add(Integer.valueOf(m96Var.a));
            }
            i7++;
        }
        w96 w96Var = b58Var.Q;
        long m = w96Var != null ? w96Var.m() : 0L;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i2 = -1;
            if (i8 >= arrayList.size()) {
                i3 = -1;
                break;
            }
            m96 m96Var2 = (m96) arrayList.get(i8);
            if (m96Var2.b || !m96Var2.e || m96Var2.g >= m) {
                if (!hashSet.contains(Integer.valueOf(m96Var2.a)) || (b58Var.x == n96Var.b && (i4 = b58Var.y) != 0 && m96Var2.a >= i4)) {
                    i9++;
                }
            }
            i8++;
        }
        if (i3 < 0) {
            int i10 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                m96 m96Var3 = (m96) arrayList.get(i6);
                if (m96Var3.b || !m96Var3.e || m96Var3.g >= m) {
                    if (hashSet.contains(Integer.valueOf(m96Var3.a))) {
                        i2 = m96Var3.a;
                        break;
                    }
                    i10++;
                }
                i6++;
            }
            i9 = i10;
        } else {
            i2 = i3;
        }
        if (i2 < 0) {
            return;
        }
        b58Var.x = n96Var.b;
        b58Var.y = i2;
        b58Var.E = true;
        o79 itemAnimator = guVar.getItemAnimator();
        guVar.setItemAnimator(null);
        b58Var.d.h1(i9, guVar.getHeight() / 2, true);
        b58Var.e.g(i9);
        guVar.setItemAnimator(itemAnimator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jcc
    public final Object g(Integer num, Object obj) {
        return this.a.f((Long) obj);
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
