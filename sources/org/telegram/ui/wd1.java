package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ wd1(xd1 xd1Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = xd1Var;
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
                xd1 xd1Var = this.b;
                String str = this.c;
                int i10 = this.d;
                xd1Var.getClass();
                Utilities.searchQueue.postRunnable(new wd1(xd1Var, str, i10, 1));
                break;
            default:
                xd1 xd1Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                yd1 yd1Var = xd1Var2.h;
                ArrayList arrayList = yd1Var.f;
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
                        boolean z4 = false;
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
                                        if (!org.telegram.messenger.y3.w(" ", str4, lowerCase2)) {
                                            i13 = i16 + 1;
                                        }
                                    }
                                    z4 = true;
                                    if (!z4) {
                                        arrayList2.add(chat);
                                        arrayList3.add((String) yd1Var.h.get(i14));
                                    }
                                }
                                if (!z4) {
                                }
                            }
                            i15++;
                            i13 = 0;
                        }
                        i14++;
                        i13 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new ct(xd1Var2, i11, arrayList2, arrayList3, 11));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ct(xd1Var2, i11, str3, str3, 11));
                    break;
                }
                break;
        }
    }
}
