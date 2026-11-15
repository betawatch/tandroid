package vg;

import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import c8.kd;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.q40;
import ug.g1;
import wg.a0;
import wg.t;
import wg.w;
import wg.z;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long cameraFlipElapsedMs;
        int i7 = this.a;
        int i10 = 1;
        Object obj = this.b;
        switch (i7) {
            case 0:
                r rVar = (r) obj;
                s sVar = rVar.a;
                if (sVar.e == rVar) {
                    sVar.n = false;
                    sVar.a();
                    break;
                }
                break;
            case 1:
                ((vh.h) obj).Z1.O(true);
                break;
            case 2:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
                cc X = cc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, spannableStringBuilder).j();
                    break;
                }
                break;
            case 3:
                ((w) obj).a(null);
                break;
            case 4:
                ((gh) obj).a(Collections.EMPTY_LIST);
                break;
            case 5:
                ((t) obj).a(null);
                break;
            case 6:
                z zVar = (z) obj;
                zVar.getClass();
                a0 a0Var = zVar.r;
                g1 g1Var = new g1(a0Var.s1, a0Var.a, null, null, null, a0Var.J0);
                g1Var.F2 = true;
                g1Var.Y1 = true;
                a0Var.s1.showDialog(g1Var);
                break;
            case 7:
                ((FrameLayout) obj).invalidate();
                break;
            case 8:
                wi.h hVar = (wi.h) ((og.b) obj).b;
                hVar.h.invalidate();
                hVar.i.requestLayout();
                break;
            case 9:
                l2.i iVar = (l2.i) obj;
                ArrayList arrayList = (ArrayList) iVar.c;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    wi.n nVar = (wi.n) arrayList.get(i11);
                    wi.h hVar2 = nVar.e;
                    if (hVar2 != null && nVar.c == 1 && hVar2.g && !hVar2.K) {
                        if ((hVar2.b.p() && kd.a(hVar2.c)) != hVar2.f) {
                            hVar2.l();
                            hVar2.a();
                        }
                    }
                }
                iVar.f();
                break;
            case 10:
                ((wi.l) obj).V();
                break;
            case 11:
                wi.n nVar2 = (wi.n) obj;
                if (nVar2.c == 1) {
                    nVar2.a.Z();
                    break;
                }
                break;
            case 12:
                xi.c cVar = (xi.c) obj;
                g0.i3(new xi.b(cVar.a, cVar.b, i10), 500L);
                break;
            case 13:
                zh.k kVar = (zh.k) obj;
                kVar.f();
                kVar.e(true);
                break;
            default:
                q40 q40Var = (q40) ((ff) obj).b;
                q40Var.r0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = q40Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                a8.b(sb2.toString());
                q40Var.w(true);
                q40.n(q40Var);
                break;
        }
    }
}
