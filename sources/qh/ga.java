package qh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class ga {
    public int a;
    public boolean b;
    public ja c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.z5 k;
    public final /* synthetic */ la l;

    public ga(la laVar) {
        this.l = laVar;
        this.k = new org.telegram.ui.Components.z5(laVar, 360L, pr.h);
    }

    public static void a(ga gaVar, boolean z4) {
        la laVar = gaVar.l;
        if (laVar.getMeasuredWidth() > 0) {
            ja jaVar = gaVar.c;
            if (jaVar == null || z4) {
                if (jaVar != null) {
                    jaVar.b();
                    gaVar.c = null;
                }
                la laVar2 = gaVar.l;
                boolean z10 = gaVar.b;
                String str = gaVar.d;
                int i10 = laVar2.s1;
                int i11 = laVar2.v1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = gaVar.e;
                gaVar.c = new ja(laVar2, z10, str, i12, dp, j10 > 2 ? Long.valueOf(j10) : null, laVar.getMaxScrollDuration(), laVar.W0, laVar.X0, new u9(gaVar, 2));
            }
        }
    }

    public static void b(ga gaVar) {
        la laVar = gaVar.l;
        int i10 = gaVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = laVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            ea eaVar = (ea) arrayList.get(gaVar.a);
            if (laVar.getMeasuredWidth() <= 0 || eaVar != null) {
                return;
            }
            if (eaVar != null) {
                eaVar.a();
            }
            arrayList.set(gaVar.a, new ea(laVar, gaVar.d, (laVar.getMeasuredWidth() - laVar.getPaddingLeft()) - laVar.getPaddingRight()));
        }
    }
}
