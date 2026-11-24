// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wv3 extends tya {
    public final /* synthetic */ boolean H3;
    public final /* synthetic */ xv3 I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv3(xv3 xv3Var, Context context, int i, wjb wjbVar, boolean z) {
        super(i, wjbVar, context);
        this.I3 = xv3Var;
        this.H3 = z;
    }

    @Override // tya
    public final qya[] E1(qya[] qyaVarArr) {
        if (qyaVarArr != null && this.H3) {
            int i = 0;
            while (true) {
                if (i >= qyaVarArr.length) {
                    i = -1;
                    break;
                }
                qya qyaVar = qyaVarArr[i];
                if (qyaVar != null && qyaVar.b) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                int length = qyaVarArr.length;
                qya[] qyaVarArr2 = new qya[length];
                qyaVarArr2[0] = qyaVarArr[i];
                int i2 = 1;
                while (i2 < length) {
                    qyaVarArr2[i2] = qyaVarArr[i2 <= i ? i2 - 1 : i2];
                    i2++;
                }
                return qyaVarArr2;
            }
        }
        return qyaVarArr;
    }

    @Override // tya
    public final void H1(int i) {
        super.H1(i);
        this.I3.d(false);
    }
}
