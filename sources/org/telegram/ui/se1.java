package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ te1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ se1(te1 te1Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = te1Var;
        this.c = str;
        this.d = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                te1 te1Var = this.b;
                String str = this.c;
                int i10 = this.d;
                te1Var.getClass();
                Utilities.searchQueue.postRunnable(new se1(te1Var, str, i10, 1));
                break;
            default:
                te1 te1Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ue1 ue1Var = te1Var2.h;
                ArrayList arrayList = ue1Var.f;
                String lowerCase = str2.trim().toLowerCase();
                String str3 = null;
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str3 = translitString;
                    }
                    int i12 = (str3 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i12];
                    strArr[0] = lowerCase;
                    if (str3 != null) {
                        strArr[1] = str3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    ArrayList arrayList3 = new ArrayList();
                    int i14 = 0;
                    while (i14 < arrayList.size()) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i14);
                        int i15 = 0;
                        boolean z10 = false;
                        while (true) {
                            if (i15 >= 2) {
                                break;
                            }
                            String publicUsername = i15 == 0 ? chat.title : ChatObject.getPublicUsername(chat);
                            if (publicUsername != null) {
                                String lowerCase2 = publicUsername.toLowerCase();
                                while (i13 < i12) {
                                    String str4 = strArr[i13];
                                    if (!lowerCase2.startsWith(str4)) {
                                        int i16 = i13;
                                        if (!org.telegram.messenger.w1.w(" ", str4, lowerCase2)) {
                                            i13 = i16 + 1;
                                        }
                                    }
                                    z10 = true;
                                    if (!z10) {
                                        arrayList2.add(chat);
                                        arrayList3.add((String) ue1Var.h.get(i14));
                                    }
                                }
                                if (!z10) {
                                }
                            }
                            i15++;
                            i13 = 0;
                        }
                        i14++;
                        i13 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t11(te1Var2, i11, arrayList2, arrayList3, 12));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t11(te1Var2, i11, str3, str3, 12));
                    break;
                }
                break;
        }
    }
}
