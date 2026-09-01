package qh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class ha {
    public int a;
    public boolean b;
    public ka c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.z5 k;
    public final /* synthetic */ ma l;

    public ha(ma maVar) {
        this.l = maVar;
        this.k = new org.telegram.ui.Components.z5(maVar, 360L, pr.h);
    }

    public static void a(ha haVar, boolean z4) {
        ma maVar = haVar.l;
        if (maVar.getMeasuredWidth() > 0) {
            ka kaVar = haVar.c;
            if (kaVar == null || z4) {
                if (kaVar != null) {
                    kaVar.b();
                    haVar.c = null;
                }
                ma maVar2 = haVar.l;
                boolean z10 = haVar.b;
                String str = haVar.d;
                int i10 = maVar2.s1;
                int i11 = maVar2.v1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = haVar.e;
                haVar.c = new ka(maVar2, z10, str, i12, dp, j10 > 2 ? Long.valueOf(j10) : null, maVar.getMaxScrollDuration(), maVar.W0, maVar.X0, new v9(haVar, 2));
            }
        }
    }

    public static void b(ha haVar) {
        ma maVar = haVar.l;
        int i10 = haVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = maVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            fa faVar = (fa) arrayList.get(haVar.a);
            if (maVar.getMeasuredWidth() <= 0 || faVar != null) {
                return;
            }
            if (faVar != null) {
                faVar.a();
            }
            arrayList.set(haVar.a, new fa(maVar, haVar.d, (maVar.getMeasuredWidth() - maVar.getPaddingLeft()) - maVar.getPaddingRight()));
        }
    }
}
