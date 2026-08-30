package ph;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class ja {
    public int a;
    public boolean b;
    public ma c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.z5 k;
    public final /* synthetic */ oa l;

    public ja(oa oaVar) {
        this.l = oaVar;
        this.k = new org.telegram.ui.Components.z5(oaVar, 360L, nr.h);
    }

    public static void a(ja jaVar, boolean z4) {
        oa oaVar = jaVar.l;
        if (oaVar.getMeasuredWidth() > 0) {
            ma maVar = jaVar.c;
            if (maVar == null || z4) {
                if (maVar != null) {
                    maVar.b();
                    jaVar.c = null;
                }
                oa oaVar2 = jaVar.l;
                boolean z10 = jaVar.b;
                String str = jaVar.d;
                int i10 = oaVar2.s1;
                int i11 = oaVar2.v1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = jaVar.e;
                jaVar.c = new ma(oaVar2, z10, str, i12, dp, j10 > 2 ? Long.valueOf(j10) : null, oaVar.getMaxScrollDuration(), oaVar.W0, oaVar.X0, new ga(jaVar, 1));
            }
        }
    }

    public static void b(ja jaVar) {
        oa oaVar = jaVar.l;
        int i10 = jaVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = oaVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            ha haVar = (ha) arrayList.get(jaVar.a);
            if (oaVar.getMeasuredWidth() <= 0 || haVar != null) {
                return;
            }
            if (haVar != null) {
                haVar.a();
            }
            arrayList.set(jaVar.a, new ha(oaVar, jaVar.d, (oaVar.getMeasuredWidth() - oaVar.getPaddingLeft()) - oaVar.getPaddingRight()));
        }
    }
}
