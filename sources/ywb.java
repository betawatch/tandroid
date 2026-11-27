// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ywb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zwb b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ ywb(zwb zwbVar, String str, int i, byte b) {
        this.a = b;
        this.b = zwbVar;
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
                zwb zwbVar = this.b;
                String str = this.c;
                int i = this.d;
                zwbVar.getClass();
                Utilities.g.c(new ywb(zwbVar, str, i, (byte) 1));
                break;
            default:
                zwb zwbVar2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                axb axbVar = zwbVar2.h;
                ArrayList arrayList = axbVar.f;
                String lowerCase = str2.trim().toLowerCase();
                String str3 = null;
                if (lowerCase.length() == 0) {
                    hl.c3(new efa((Object) zwbVar2, i2, (Object) str3, (Object) str3, (byte) 13));
                    break;
                } else {
                    boolean z = false;
                    String S0 = ob6.D0().S0(lowerCase, true, false);
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
                            String K = i5 == 0 ? chat.title : xc2.K(chat, z2);
                            if (K != null) {
                                String lowerCase2 = K.toLowerCase();
                                for (int i7 = z2; i7 < i3; i7++) {
                                    String str4 = strArr[i7];
                                    if (lowerCase2.startsWith(str4) || uh9.t(" ", str4, lowerCase2)) {
                                        i6 = 1;
                                        if (i6 == 0) {
                                            arrayList2.add(chat);
                                            arrayList3.add((String) axbVar.h.get(i4));
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
                    hl.c3(new efa((Object) zwbVar2, i2, (Object) arrayList2, (Object) arrayList3, (byte) 13));
                    break;
                }
                break;
        }
    }
}
