package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t50 b;
    public final /* synthetic */ String c;

    public /* synthetic */ s50(t50 t50Var, String str, int i10) {
        this.a = i10;
        this.b = t50Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String K;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        switch (this.a) {
            case 0:
                t50 t50Var = this.b;
                String str2 = this.c;
                t50Var.getClass();
                org.telegram.messenger.i0.g3(new s50(t50Var, str2, 1));
                break;
            case 1:
                t50 t50Var2 = this.b;
                String str3 = this.c;
                zf.m1 m1Var = t50Var2.f;
                v50 v50Var = t50Var2.I;
                m1Var.g(str3, true, v50Var.O || v50Var.P, true, false, 0L, false, 0, 0);
                org.telegram.messenger.r5 r5Var = Utilities.g;
                s50 s50Var = new s50(t50Var2, str3, 2);
                t50Var2.h = s50Var;
                r5Var.c(s50Var);
                break;
            default:
                t50 t50Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = t50Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    org.telegram.messenger.i0.g3(new qq(t50Var3, new ArrayList(), new ArrayList(), 10));
                    break;
                } else {
                    boolean z11 = true;
                    ?? r62 = 0;
                    String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                    if (lowerCase.equals(R0) || R0.isEmpty()) {
                        R0 = null;
                    }
                    int i10 = (R0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i10];
                    strArr[0] = lowerCase;
                    if (R0 != null) {
                        strArr[1] = R0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i11);
                        boolean z12 = tLObject instanceof TLRPC.User;
                        if (z12) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            str = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                            K = org.telegram.messenger.h20.n(user);
                        } else {
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                str = chat.title;
                                K = org.telegram.messenger.w3.K(chat, r62);
                            }
                            arrayList = arrayList2;
                            z10 = z11;
                            i11++;
                            z11 = z10;
                            arrayList2 = arrayList;
                            r62 = 0;
                        }
                        String R02 = org.telegram.messenger.cd.D0().R0(str, z11, r62);
                        if (str.equals(R02)) {
                            R02 = null;
                        }
                        char c11 = r62;
                        for (int i12 = r62; i12 < i10; i12++) {
                            String str5 = strArr[i12];
                            if (str.startsWith(str5) || sc.e.y(" ", str5, str) || (R02 != null && (R02.startsWith(str5) || sc.e.y(" ", str5, R02)))) {
                                c10 = 1;
                            } else {
                                if (K != null && K.startsWith(str5)) {
                                    c11 = 2;
                                }
                                c10 = c11;
                            }
                            if (c10 != 0) {
                                arrayList = arrayList2;
                                z10 = true;
                                if (c10 == 1) {
                                    if (z12) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(org.telegram.messenger.i0.r0(user2.first_name, user2.last_name, str5));
                                    } else if (tLObject instanceof TLRPC.Chat) {
                                        obj = null;
                                        arrayList4.add(org.telegram.messenger.i0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                    obj = null;
                                } else {
                                    obj = null;
                                    arrayList4.add(org.telegram.messenger.i0.r0(sc.e.h("@", K), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                                i11++;
                                z11 = z10;
                                arrayList2 = arrayList;
                                r62 = 0;
                            } else {
                                char c12 = c10;
                                z11 = true;
                                arrayList2 = arrayList2;
                                c11 = c12;
                            }
                        }
                        arrayList = arrayList2;
                        z10 = z11;
                        i11++;
                        z11 = z10;
                        arrayList2 = arrayList;
                        r62 = 0;
                    }
                    org.telegram.messenger.i0.g3(new qq(t50Var3, arrayList3, arrayList4, 10));
                    break;
                }
                break;
        }
    }
}
