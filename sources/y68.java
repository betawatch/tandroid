// default package

import android.app.Activity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y68 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ pcc d;

    public /* synthetic */ y68(String[] strArr, Activity activity, pcc pccVar, byte b) {
        this.a = b;
        this.b = strArr;
        this.c = activity;
        this.d = pccVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        pcc pccVar = this.d;
        Activity activity = this.c;
        String[] strArr = this.b;
        switch (b) {
            case 0:
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (activity.checkSelfPermission(strArr[i]) == 0) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                }
                pccVar.a(Boolean.valueOf(z));
                break;
            default:
                int length2 = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        z = true;
                    } else if (activity.checkSelfPermission(strArr[i2]) == 0) {
                        i2++;
                    }
                }
                pccVar.a(Boolean.valueOf(z));
                break;
        }
    }
}
