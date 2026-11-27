// default package

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class zu2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lv2 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ zu2(lv2 lv2Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = lv2Var;
        this.c = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a3, code lost:
    
        if (r12 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a5, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a8, code lost:
    
        cc4.b("performWriteContactsToPhoneBookInternal " + (java.lang.System.currentTimeMillis() - r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018e, code lost:
    
        if (r12 != null) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Cursor cursor;
        long j;
        int i = 0;
        switch (this.a) {
            case 0:
                lv2 lv2Var = this.b;
                ArrayList arrayList = this.c;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        Account account = lv2Var.a;
                        if (!lv2.w() || account == null) {
                            return;
                        }
                        if (!(a.b.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0)) {
                            return;
                        }
                        SharedPreferences sharedPreferences = uc7.s1(lv2Var.currentAccount).Y3;
                        boolean z = sharedPreferences.getBoolean("contacts_updated_v7", false);
                        boolean z2 = !z;
                        if (!z) {
                            sharedPreferences.edit().putBoolean("contacts_updated_v7", true).commit();
                        }
                        ContentResolver contentResolver = a.b.getContentResolver();
                        Cursor query = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id", "sync2", "account_name"}, "account_type=?", new String[]{account.type}, "deleted ASC");
                        try {
                            try {
                                zh6 zh6Var = new zh6();
                                if (query == null) {
                                    j = currentTimeMillis;
                                    cursor = query;
                                    break;
                                } else {
                                    zh6 zh6Var2 = new zh6();
                                    ArrayList arrayList2 = new ArrayList();
                                    while (query.moveToNext()) {
                                        long j2 = query.getLong(i);
                                        j = currentTimeMillis;
                                        try {
                                            long j3 = query.getLong(1);
                                            if (j3 != 0) {
                                                if (account.name.equals(query.getString(2))) {
                                                    if (!z || zh6Var2.h(j3) >= 0) {
                                                        arrayList2.add(Long.valueOf(j2));
                                                    } else {
                                                        zh6Var2.k(j3, Long.valueOf(j2));
                                                    }
                                                }
                                                zh6Var.k(j3, Long.valueOf(j2));
                                            }
                                            currentTimeMillis = j;
                                            i = 0;
                                        } catch (Exception e) {
                                            e = e;
                                            cursor = query;
                                            try {
                                                cc4.g(e, true);
                                                break;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    j = currentTimeMillis;
                                    query.close();
                                    try {
                                        cc4.b("performWriteContactsToPhoneBookInternal contacts array " + arrayList.size() + " " + z2 + " bookContactsSize=" + zh6Var.m() + " toDelete=" + arrayList2.size() + " currentAccount=" + lv2Var.currentAccount);
                                        if (!arrayList2.isEmpty()) {
                                            lv2Var.k(contentResolver, account, arrayList2, zh6Var2, zh6Var);
                                        }
                                        ArrayList arrayList3 = null;
                                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i2);
                                            if (!z || zh6Var.h(tL_contact.user_id) < 0) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                lv2Var.b(arrayList3, lv2Var.getMessagesController().X1(Long.valueOf(tL_contact.user_id)));
                                                if (arrayList3.size() > 450) {
                                                    contentResolver.applyBatch("com.android.contacts", arrayList3);
                                                    arrayList3.clear();
                                                }
                                            }
                                        }
                                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                                            contentResolver.applyBatch("com.android.contacts", arrayList3);
                                            arrayList3.clear();
                                        }
                                        cursor = null;
                                        break;
                                    } catch (Exception e2) {
                                        e = e2;
                                        cursor = null;
                                        cc4.g(e, true);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = query;
                                if (cursor != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            j = currentTimeMillis;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        j = currentTimeMillis;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                }
                break;
            case 1:
                lv2 lv2Var2 = this.b;
                ArrayList arrayList4 = this.c;
                int size = arrayList4.size();
                while (i < size) {
                    Object obj = arrayList4.get(i);
                    i++;
                    lv2Var2.j(((TLRPC.User) obj).id);
                }
                return;
            default:
                this.b.i(this.c, false);
                return;
        }
    }
}
