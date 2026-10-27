package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u70 b;
    public final /* synthetic */ String c;

    public /* synthetic */ t70(u70 u70Var, String str, int i10) {
        this.a = i10;
        this.b = u70Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.searchQueue.postRunnable(new t70(this.b, this.c, 1));
                break;
            default:
                u70 u70Var = this.b;
                String str = this.c;
                v70 v70Var = u70Var.b;
                String lowerCase = str.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.isEmpty()) {
                        translitString = null;
                    }
                    int i10 = 0;
                    int i11 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i11];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i12 < v70Var.n.v.size()) {
                        ContactsController.Contact contact = (ContactsController.Contact) v70Var.n.v.get(i12);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i13 = i10;
                        int i14 = i13;
                        while (true) {
                            if (i13 < i11) {
                                String str2 = strArr[i13];
                                if (lowerCase2.startsWith(str2) || org.telegram.messenger.wh.u(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.wh.u(" ", str2, translitString2)))) {
                                    i14 = 1;
                                }
                                if (i14 != 0) {
                                    arrayList2.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                    arrayList.add(contact);
                                } else {
                                    i13++;
                                }
                            }
                        }
                        i12++;
                        i10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new pq(v70Var, arrayList, arrayList2, 12));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    v70Var.getClass();
                    AndroidUtilities.runOnUIThread(new pq(v70Var, arrayList3, arrayList4, 12));
                    break;
                }
                break;
        }
    }
}
