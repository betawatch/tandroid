package rf;

import bg.j3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.il0;
import org.telegram.ui.qx;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ p(a0 a0Var, int i10, String str, String str2) {
        this.a = 0;
        this.b = a0Var;
        this.d = i10;
        this.c = str;
        this.e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        boolean z10;
        String str;
        int i10;
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                int i11 = a0Var.R;
                int i12 = a0Var.d0;
                a0Var.h = null;
                int i13 = a0Var.Z;
                int i14 = this.d;
                if (i14 == i13) {
                    if (i11 == 2 || i12 == 6 || i12 == 5 || a0Var.Q.a() != 0) {
                        a0Var.z0 -= 2;
                    } else {
                        t tVar = a0Var.f0;
                        boolean z11 = i12 != 4;
                        if (i12 == 4 || i12 == 11) {
                            j10 = 0;
                            z10 = false;
                        } else {
                            j10 = 0;
                            z10 = true;
                        }
                        boolean z12 = i12 == 2 || i12 == 1;
                        boolean z13 = i12 == 0;
                        qx qxVar = a0Var.Q;
                        if (qxVar != null) {
                            j10 = qxVar.a();
                        }
                        tVar.h(this.c, true, z11, true, z10, z12, 0L, z13, 0, i14, j10, null);
                        i14 = i14;
                    }
                    if (i11 != 0 && i12 != 15) {
                        String str2 = this.e;
                        a0Var.X(str2);
                        a0Var.W(i14, str2);
                        a0Var.V(i14, str2);
                        break;
                    } else {
                        a0Var.z0--;
                        break;
                    }
                }
                break;
            case 1:
                a0 a0Var2 = this.b;
                a0Var2.getClass();
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList<CharSequence> arrayList2 = new ArrayList<>();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                new ArrayList();
                MessagesStorage messagesStorage = MessagesStorage.getInstance(a0Var2.o0);
                int i15 = a0Var2.d0;
                ArrayList<Long> arrayList4 = a0Var2.m0;
                String str3 = this.c;
                messagesStorage.localSearch(i15, str3, arrayList, arrayList2, arrayList3, arrayList4, -1);
                AndroidUtilities.runOnUIThread(new j3((il0) a0Var2, this.d, (ArrayList) arrayList, (ArrayList) arrayList2, (ArrayList) arrayList3, 28));
                h0.y1(str3, a0Var2.u0);
                a0Var2.v0 = false;
                if (str3.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str3) || "archive".startsWith(this.e))) {
                    a0Var2.v0 = true;
                }
                AndroidUtilities.runOnUIThread(new q(a0Var2, 0));
                break;
            default:
                a0 a0Var3 = this.b;
                a0Var3.f = null;
                int i16 = a0Var3.R;
                String str4 = this.c;
                int i17 = this.d;
                if (i16 != 2) {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() != 0) {
                        str = str4;
                        i10 = i17;
                        MessagesStorage.getInstance(a0Var3.o0).getStorageQueue().postRunnable(new p(a0Var3, lowerCase, i10, str, 1));
                        if (a0Var3.d0 == 15) {
                            p pVar = new p(a0Var3, i10, str, this.e);
                            a0Var3.h = pVar;
                            AndroidUtilities.runOnUIThread(pVar);
                            break;
                        } else {
                            a0Var3.z0 -= 2;
                            break;
                        }
                    } else {
                        a0Var3.Z = 0;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        new ArrayList();
                        AndroidUtilities.runOnUIThread(new j3((il0) a0Var3, a0Var3.Z, arrayList5, arrayList6, arrayList7, 28));
                    }
                }
                str = str4;
                i10 = i17;
                if (a0Var3.d0 == 15) {
                }
        }
    }

    public /* synthetic */ p(a0 a0Var, String str, int i10, String str2, int i11) {
        this.a = i11;
        this.b = a0Var;
        this.c = str;
        this.d = i10;
        this.e = str2;
    }
}
