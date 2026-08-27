package pf;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rx;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ o(z zVar, int i10, String str, String str2) {
        this.a = 0;
        this.b = zVar;
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
                z zVar = this.b;
                int i11 = zVar.R;
                int i12 = zVar.d0;
                zVar.h = null;
                int i13 = zVar.Z;
                int i14 = this.d;
                if (i14 == i13) {
                    if (i11 == 2 || i12 == 6 || i12 == 5 || zVar.Q.a() != 0) {
                        zVar.z0 -= 2;
                    } else {
                        s sVar = zVar.f0;
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
                        rx rxVar = zVar.Q;
                        if (rxVar != null) {
                            j10 = rxVar.a();
                        }
                        sVar.h(this.c, true, z11, true, z10, z12, 0L, z13, 0, i14, j10, null);
                        i14 = i14;
                    }
                    if (i11 != 0 && i12 != 15) {
                        String str2 = this.e;
                        zVar.X(str2);
                        zVar.W(i14, str2);
                        zVar.V(i14, str2);
                        break;
                    } else {
                        zVar.z0--;
                        break;
                    }
                }
                break;
            case 1:
                z zVar2 = this.b;
                zVar2.getClass();
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList<CharSequence> arrayList2 = new ArrayList<>();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                new ArrayList();
                MessagesStorage messagesStorage = MessagesStorage.getInstance(zVar2.o0);
                int i15 = zVar2.d0;
                ArrayList<Long> arrayList4 = zVar2.m0;
                String str3 = this.c;
                messagesStorage.localSearch(i15, str3, arrayList, arrayList2, arrayList3, arrayList4, -1);
                AndroidUtilities.runOnUIThread(new gh.e1(zVar2, this.d, arrayList, arrayList2, arrayList3, 27));
                g0.y1(str3, zVar2.u0);
                zVar2.v0 = false;
                if (str3.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str3) || "archive".startsWith(this.e))) {
                    zVar2.v0 = true;
                }
                AndroidUtilities.runOnUIThread(new p(zVar2, 0));
                break;
            default:
                z zVar3 = this.b;
                zVar3.f = null;
                int i16 = zVar3.R;
                String str4 = this.c;
                int i17 = this.d;
                if (i16 != 2) {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() != 0) {
                        str = str4;
                        i10 = i17;
                        MessagesStorage.getInstance(zVar3.o0).getStorageQueue().postRunnable(new o(zVar3, lowerCase, i10, str, 1));
                        if (zVar3.d0 == 15) {
                            o oVar = new o(zVar3, i10, str, this.e);
                            zVar3.h = oVar;
                            AndroidUtilities.runOnUIThread(oVar);
                            break;
                        } else {
                            zVar3.z0 -= 2;
                            break;
                        }
                    } else {
                        zVar3.Z = 0;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        new ArrayList();
                        AndroidUtilities.runOnUIThread(new gh.e1(zVar3, zVar3.Z, arrayList5, arrayList6, arrayList7, 27));
                    }
                }
                str = str4;
                i10 = i17;
                if (zVar3.d0 == 15) {
                }
        }
    }

    public /* synthetic */ o(z zVar, String str, int i10, String str2, int i11) {
        this.a = i11;
        this.b = zVar;
        this.c = str;
        this.d = i10;
        this.e = str2;
    }
}
