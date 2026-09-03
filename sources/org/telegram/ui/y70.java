package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z70 b;
    public final /* synthetic */ String c;

    public /* synthetic */ y70(z70 z70Var, String str, int i10) {
        this.a = i10;
        this.b = z70Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.searchQueue.postRunnable(new y70(this.b, this.c, 1));
                break;
            default:
                z70 z70Var = this.b;
                String str = this.c;
                a80 a80Var = z70Var.b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    a80Var.getClass();
                    AndroidUtilities.runOnUIThread(new tq(a80Var, arrayList, arrayList2, 12));
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
                    for (int i11 = 0; i11 < a80Var.n.w.size(); i11++) {
                        ContactsController.Contact contact = (ContactsController.Contact) a80Var.n.w.get(i11);
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
                    AndroidUtilities.runOnUIThread(new tq(a80Var, arrayList3, arrayList4, 12));
                    break;
                }
                break;
        }
    }
}
