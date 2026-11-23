package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w40 b;
    public final /* synthetic */ String c;

    public /* synthetic */ v40(w40 w40Var, String str, int i7) {
        this.a = i7;
        this.b = w40Var;
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
                w40 w40Var = this.b;
                String str2 = this.c;
                w40Var.getClass();
                org.telegram.messenger.g0.g3(new v40(w40Var, str2, 1));
                break;
            case 1:
                w40 w40Var2 = this.b;
                String str3 = this.c;
                jg.z1 z1Var = w40Var2.f;
                y40 y40Var = w40Var2.J;
                z1Var.g(str3, true, y40Var.P || y40Var.Q, true, false, 0L, false, 0, 0);
                org.telegram.messenger.q5 q5Var = Utilities.g;
                v40 v40Var = new v40(w40Var2, str3, 2);
                w40Var2.h = v40Var;
                q5Var.c(v40Var);
                break;
            default:
                w40 w40Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = w40Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    org.telegram.messenger.g0.g3(new up(w40Var3, new ArrayList(), new ArrayList(), 10));
                    break;
                } else {
                    boolean z11 = true;
                    ?? r62 = 0;
                    String T0 = org.telegram.messenger.gd.E0().T0(lowerCase, true, false);
                    if (lowerCase.equals(T0) || T0.isEmpty()) {
                        T0 = null;
                    }
                    int i7 = (T0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i7];
                    strArr[0] = lowerCase;
                    if (T0 != null) {
                        strArr[1] = T0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i10);
                        boolean z12 = tLObject instanceof TLRPC.User;
                        if (z12) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            str = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                            K = org.telegram.messenger.n10.o(user);
                        } else {
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                str = chat.title;
                                K = org.telegram.messenger.v3.K(chat, r62);
                            }
                            arrayList = arrayList2;
                            z10 = z11;
                            i10++;
                            z11 = z10;
                            arrayList2 = arrayList;
                            r62 = 0;
                        }
                        String T02 = org.telegram.messenger.gd.E0().T0(str, z11, r62);
                        if (str.equals(T02)) {
                            T02 = null;
                        }
                        char c11 = r62;
                        for (int i11 = r62; i11 < i7; i11++) {
                            String str5 = strArr[i11];
                            if (str.startsWith(str5) || i5.c.B(" ", str5, str) || (T02 != null && (T02.startsWith(str5) || i5.c.B(" ", str5, T02)))) {
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
                                        arrayList4.add(org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, str5));
                                    } else if (tLObject instanceof TLRPC.Chat) {
                                        obj = null;
                                        arrayList4.add(org.telegram.messenger.g0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                    obj = null;
                                } else {
                                    obj = null;
                                    arrayList4.add(org.telegram.messenger.g0.r0(p5.c.k("@", K), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                                i10++;
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
                        i10++;
                        z11 = z10;
                        arrayList2 = arrayList;
                        r62 = 0;
                    }
                    org.telegram.messenger.g0.g3(new up(w40Var3, arrayList3, arrayList4, 10));
                    break;
                }
                break;
        }
    }
}
