// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xsb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ysb b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ xsb(ysb ysbVar, String str, int i, byte b) {
        this.a = b;
        this.b = ysbVar;
        this.c = str;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                ysb ysbVar = this.b;
                String str = this.c;
                int i = this.d;
                ysbVar.getClass();
                Utilities.g.c(new xsb(ysbVar, str, i, (byte) 1));
                break;
            default:
                ysb ysbVar2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                zsb zsbVar = ysbVar2.h;
                ArrayList arrayList = zsbVar.f;
                String lowerCase = str2.trim().toLowerCase();
                String str3 = null;
                if (lowerCase.length() == 0) {
                    gl.c3(new ica((Object) ysbVar2, i2, (Object) str3, (Object) str3, (byte) 11));
                    break;
                } else {
                    boolean z = false;
                    String S0 = k96.D0().S0(lowerCase, true, false);
                    if (!lowerCase.equals(S0) && S0.length() != 0) {
                        str3 = S0;
                    }
                    int i3 = (str3 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i3];
                    strArr[0] = lowerCase;
                    if (str3 != null) {
                        strArr[1] = str3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i4 = 0;
                    while (i4 < arrayList.size()) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i4);
                        int i5 = z ? 1 : 0;
                        int i6 = i5;
                        boolean z2 = z;
                        while (true) {
                            if (i5 >= 2) {
                                break;
                            }
                            String K = i5 == 0 ? chat.title : hc2.K(chat, z2);
                            if (K != null) {
                                String lowerCase2 = K.toLowerCase();
                                for (int i7 = z2; i7 < i3; i7++) {
                                    String str4 = strArr[i7];
                                    if (lowerCase2.startsWith(str4) || de9.t(" ", str4, lowerCase2)) {
                                        i6 = 1;
                                        if (i6 == 0) {
                                            arrayList2.add(chat);
                                            arrayList3.add((String) zsbVar.h.get(i4));
                                        }
                                    }
                                }
                                if (i6 == 0) {
                                }
                            }
                            i5++;
                            z2 = 0;
                        }
                        i4++;
                        z = false;
                    }
                    gl.c3(new ica((Object) ysbVar2, i2, (Object) arrayList2, (Object) arrayList3, (byte) 11));
                    break;
                }
                break;
        }
    }
}
