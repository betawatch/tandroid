package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ wh1(xh1 xh1Var, String str, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = xh1Var;
        this.c = str;
        this.d = z10;
        this.e = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cd, code lost:
    
        if (r3 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e1, code lost:
    
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c A[LOOP:1: B:30:0x00fc->B:48:0x017c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        char c10;
        String str2;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        String str3;
        int i10;
        switch (this.a) {
            case 0:
                xh1 xh1Var = this.b;
                String str4 = this.c;
                boolean z12 = this.d;
                boolean z13 = this.e;
                xh1Var.getClass();
                AndroidUtilities.runOnUIThread(new wh1(xh1Var, str4, z12, z13, 1));
                break;
            case 1:
                xh1 xh1Var2 = this.b;
                String str5 = this.c;
                boolean z14 = this.d;
                boolean z15 = this.e;
                xh1Var2.f.g(str5, true, z14, z14, xh1Var2.v.G, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                wh1 wh1Var = new wh1(xh1Var2, str5, z15, z14, 2);
                xh1Var2.h = wh1Var;
                dispatchQueue.postRunnable(wh1Var);
                break;
            default:
                xh1 xh1Var3 = this.b;
                String str6 = this.c;
                boolean z16 = this.d;
                boolean z17 = this.e;
                ArrayList arrayList2 = xh1Var3.r;
                String lowerCase = str6.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i11 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i11];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i12);
                        String[] strArr2 = new String[3];
                        boolean z18 = tLObject instanceof TLRPC.User;
                        if (!z18) {
                            str = null;
                            c10 = 1;
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            strArr2[0] = chat.title.toLowerCase();
                            str2 = chat.username;
                            break;
                        } else {
                            str = null;
                            TLRPC.User user = (TLRPC.User) tLObject;
                            c10 = 1;
                            strArr2[0] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                            str2 = UserObject.getPublicUsername(user);
                            if (UserObject.isReplyUser(user)) {
                                strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                            } else if (UserObject.isUserSelf(user)) {
                                if (xh1Var3.v.G) {
                                    strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                }
                                z10 = z16;
                                z11 = z17;
                                arrayList = arrayList2;
                            } else if (user.bot) {
                            }
                            String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[0]);
                            strArr2[c10] = translitString2;
                            if (strArr2[0].equals(translitString2)) {
                                strArr2[c10] = str;
                            }
                            int i13 = 0;
                            char c11 = 0;
                            while (i13 < i11) {
                                z10 = z16;
                                String str7 = strArr[i13];
                                z11 = z17;
                                arrayList = arrayList2;
                                int i14 = 0;
                                while (i14 < 3) {
                                    String str8 = strArr2[i14];
                                    if (str8 != null) {
                                        if (!str8.startsWith(str7)) {
                                            i10 = i14;
                                            if (org.telegram.messenger.w1.w(" ", str7, str8)) {
                                            }
                                        }
                                        c11 = 1;
                                        if (c11 == 0 && str2 != null && str2.toLowerCase().startsWith(str7)) {
                                            c11 = 2;
                                        }
                                        if (c11 == 0) {
                                            if (c11 != 1) {
                                                str3 = str;
                                                arrayList4.add(AndroidUtilities.generateSearchName(org.telegram.ui.Cells.p6.i("@", str2), str3, "@" + str7));
                                            } else if (z18) {
                                                TLRPC.User user2 = (TLRPC.User) tLObject;
                                                arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str7));
                                                str3 = str;
                                            } else {
                                                str3 = str;
                                                arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, str3, str7));
                                            }
                                            arrayList3.add(tLObject);
                                        } else {
                                            i13++;
                                            arrayList2 = arrayList;
                                            z16 = z10;
                                            z17 = z11;
                                        }
                                    } else {
                                        i10 = i14;
                                    }
                                    i14 = i10 + 1;
                                }
                                if (c11 == 0) {
                                    c11 = 2;
                                }
                                if (c11 == 0) {
                                }
                            }
                            z10 = z16;
                            z11 = z17;
                            arrayList = arrayList2;
                        }
                        i12++;
                        arrayList2 = arrayList;
                        z16 = z10;
                        z17 = z11;
                    }
                    AndroidUtilities.runOnUIThread(new yd1(xh1Var3, arrayList3, arrayList4, 6));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new yd1(xh1Var3, new ArrayList(), new ArrayList(), 6));
                    break;
                }
        }
    }
}
