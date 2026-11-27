// default package

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class uu2 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Serializable i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Cloneable m;

    public /* synthetic */ uu2(lv2 lv2Var, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i, HashMap hashMap3, boolean z, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = lv2Var;
        this.e = hashMap;
        this.j = sparseArray;
        this.k = zArr;
        this.f = hashMap2;
        this.l = tL_contacts_importContacts;
        this.c = i;
        this.g = hashMap3;
        this.b = z;
        this.h = hashMap4;
        this.m = arrayList;
        this.i = hashMap5;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                lv2 lv2Var = (lv2) this.d;
                HashMap hashMap = (HashMap) this.e;
                SparseArray sparseArray = (SparseArray) this.j;
                boolean[] zArr = (boolean[]) this.k;
                HashMap hashMap2 = (HashMap) this.f;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.l;
                int i = this.c;
                HashMap hashMap3 = (HashMap) this.g;
                boolean z3 = this.b;
                HashMap hashMap4 = (HashMap) this.h;
                ArrayList arrayList = (ArrayList) this.m;
                HashMap hashMap5 = (HashMap) this.i;
                boolean z4 = true;
                lv2Var.n0++;
                if (tL_error == null) {
                    if (f11.a) {
                        cc4.b("contacts imported");
                    }
                    TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
                    if (tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                        z2 = true;
                        z = false;
                    } else {
                        int i2 = 0;
                        while (i2 < tL_contacts_importedContacts.retry_contacts.size()) {
                            hashMap.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i2).longValue()));
                            i2++;
                            z4 = z4;
                        }
                        z2 = z4;
                        z = false;
                        z = false;
                        zArr[0] = z2;
                        if (f11.a) {
                            cc4.b("result has retry contacts");
                        }
                    }
                    for (int i3 = z ? 1 : 0; i3 < tL_contacts_importedContacts.popular_invites.size(); i3++) {
                        TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i3);
                        iv2 iv2Var = (iv2) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                        if (iv2Var != null) {
                            iv2Var.l = tL_popularContact.importers;
                        }
                    }
                    boolean z5 = z2;
                    lv2Var.getMessagesStorage().j1(tL_contacts_importedContacts.users, null, z5, z5);
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = z ? 1 : 0;
                    while (i4 < tL_contacts_importedContacts.imported.size()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = tL_contacts_importedContacts.imported.get(i4).user_id;
                        arrayList2.add(tL_contact);
                        i4++;
                        lv2Var = lv2Var;
                    }
                    hl.c3(new av2(lv2Var, tL_contacts_importedContacts.users, 2, arrayList2, (byte) 0));
                } else {
                    boolean z6 = false;
                    int i5 = 0;
                    while (i5 < tL_contacts_importContacts.contacts.size()) {
                        hashMap.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i5).client_id));
                        i5++;
                        z6 = z6;
                    }
                    z = z6;
                    zArr[z ? 1 : 0] = true;
                    if (f11.a) {
                        uh9.s(tL_error.text, new StringBuilder("import contacts error "));
                    }
                }
                if (lv2Var.n0 == i) {
                    if (!hashMap.isEmpty()) {
                        boolean z7 = z;
                        lv2Var.getMessagesStorage().W0(hashMap, z7, z7);
                    }
                    Utilities.d.c(new oq6(lv2Var, hashMap3, hashMap2, z3, hashMap4, arrayList, hashMap5, zArr));
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                tg5 tg5Var = (tg5) this.e;
                boolean z8 = this.b;
                Long l = (Long) this.f;
                l01 l01Var = (l01) this.g;
                Long l2 = (Long) this.h;
                Integer num = (Integer) this.i;
                Integer num2 = (Integer) this.j;
                byte[] bArr = (byte[]) this.k;
                e eVar = (e) this.l;
                int i6 = this.c;
                Bundle bundle = (Bundle) this.m;
                String str = LaunchActivity.C1;
                hl.c3(new j06(launchActivity, tg5Var, tLObject, z8, l, l01Var, l2, num, num2, bArr, eVar, i6, bundle));
                break;
        }
    }

    public /* synthetic */ uu2(LaunchActivity launchActivity, tg5 tg5Var, boolean z, Long l, l01 l01Var, Long l2, Integer num, Integer num2, byte[] bArr, e eVar, int i, Bundle bundle) {
        this.d = launchActivity;
        this.e = tg5Var;
        this.b = z;
        this.f = l;
        this.g = l01Var;
        this.h = l2;
        this.i = num;
        this.j = num2;
        this.k = bArr;
        this.l = eVar;
        this.c = i;
        this.m = bundle;
    }
}
