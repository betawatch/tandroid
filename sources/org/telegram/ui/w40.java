package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x40 b;
    public final /* synthetic */ String c;

    public /* synthetic */ w40(x40 x40Var, String str, int i7) {
        this.a = i7;
        this.b = x40Var;
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
        boolean z9;
        char c10;
        Object obj;
        switch (this.a) {
            case 0:
                x40 x40Var = this.b;
                String str2 = this.c;
                x40Var.getClass();
                org.telegram.messenger.g0.h3(new w40(x40Var, str2, 1));
                break;
            case 1:
                x40 x40Var2 = this.b;
                String str3 = this.c;
                jg.z1 z1Var = x40Var2.f;
                z40 z40Var = x40Var2.I;
                z1Var.g(str3, true, z40Var.O || z40Var.P, true, false, 0L, false, 0, 0);
                org.telegram.messenger.p5 p5Var = Utilities.g;
                w40 w40Var = new w40(x40Var2, str3, 2);
                x40Var2.h = w40Var;
                p5Var.c(w40Var);
                break;
            default:
                x40 x40Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = x40Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    org.telegram.messenger.g0.h3(new tp(x40Var3, new ArrayList(), new ArrayList(), 10));
                    break;
                } else {
                    boolean z10 = true;
                    ?? r62 = 0;
                    String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.isEmpty()) {
                        S0 = null;
                    }
                    int i7 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i7];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i10);
                        boolean z11 = tLObject instanceof TLRPC.User;
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            str = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                            K = org.telegram.messenger.t10.n(user);
                        } else {
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                str = chat.title;
                                K = org.telegram.messenger.t3.K(chat, r62);
                            }
                            arrayList = arrayList2;
                            z9 = z10;
                            i10++;
                            z10 = z9;
                            arrayList2 = arrayList;
                            r62 = 0;
                        }
                        String S02 = org.telegram.messenger.id.E0().S0(str, z10, r62);
                        if (str.equals(S02)) {
                            S02 = null;
                        }
                        char c11 = r62;
                        for (int i11 = r62; i11 < i7; i11++) {
                            String str5 = strArr[i11];
                            if (str.startsWith(str5) || jg.g.A(" ", str5, str) || (S02 != null && (S02.startsWith(str5) || jg.g.A(" ", str5, S02)))) {
                                c10 = 1;
                            } else {
                                if (K != null && K.startsWith(str5)) {
                                    c11 = 2;
                                }
                                c10 = c11;
                            }
                            if (c10 != 0) {
                                arrayList = arrayList2;
                                z9 = true;
                                if (c10 == 1) {
                                    if (z11) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, str5));
                                    } else if (tLObject instanceof TLRPC.Chat) {
                                        obj = null;
                                        arrayList4.add(org.telegram.messenger.g0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                    obj = null;
                                } else {
                                    obj = null;
                                    arrayList4.add(org.telegram.messenger.g0.r0(rf.b.i("@", K), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                                i10++;
                                z10 = z9;
                                arrayList2 = arrayList;
                                r62 = 0;
                            } else {
                                char c12 = c10;
                                z10 = true;
                                arrayList2 = arrayList2;
                                c11 = c12;
                            }
                        }
                        arrayList = arrayList2;
                        z9 = z10;
                        i10++;
                        z10 = z9;
                        arrayList2 = arrayList;
                        r62 = 0;
                    }
                    org.telegram.messenger.g0.h3(new tp(x40Var3, arrayList3, arrayList4, 10));
                    break;
                }
                break;
        }
    }
}
