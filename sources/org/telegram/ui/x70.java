package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y70 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x70(y70 y70Var, String str, int i10) {
        this.a = i10;
        this.b = y70Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.searchQueue.postRunnable(new x70(this.b, this.c, 1));
                break;
            default:
                y70 y70Var = this.b;
                String str = this.c;
                z70 z70Var = y70Var.b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    z70Var.getClass();
                    AndroidUtilities.runOnUIThread(new sq(z70Var, arrayList, arrayList2, 12));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.isEmpty()) {
                        translitString = null;
                    }
                    int i10 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i10];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < z70Var.n.w.size(); i11++) {
                        ContactsController.Contact contact = (ContactsController.Contact) z70Var.n.w.get(i11);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i12 = 0;
                        boolean z4 = false;
                        while (true) {
                            if (i12 < i10) {
                                String str2 = strArr[i12];
                                if (lowerCase2.startsWith(str2) || org.telegram.messenger.y3.w(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.y3.w(" ", str2, translitString2)))) {
                                    z4 = true;
                                }
                                if (z4) {
                                    arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                    arrayList3.add(contact);
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new sq(z70Var, arrayList3, arrayList4, 12));
                    break;
                }
                break;
        }
    }
}
