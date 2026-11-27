// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class u5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rf0 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ int s;

    public /* synthetic */ u5a(uc7 uc7Var, TLRPC.User user, int i, boolean z, TLRPC.UserFull userFull, ArrayList arrayList, HashMap hashMap, int i2, boolean z2) {
        this.a = (byte) 2;
        this.b = uc7Var;
        this.f = user;
        this.e = i;
        this.d = z;
        this.n = userFull;
        this.c = arrayList;
        this.r = hashMap;
        this.s = i2;
        this.h = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.r;
        TLObject tLObject = this.n;
        TLObject tLObject2 = this.f;
        rf0 rf0Var = this.b;
        switch (b) {
            case 0:
                r7a r7aVar = (r7a) rf0Var;
                r7aVar.getMessagesStorage().a.c(new u5a(r7aVar, this.c, this.d ? 1 : 0, this.e, (TLRPC.Message) tLObject2, this.h ? 1 : 0, (TLRPC.Message) tLObject, (r47) obj, this.s, (byte) 1));
                break;
            case 1:
                r7a r7aVar2 = (r7a) rf0Var;
                jf7 messagesStorage = r7aVar2.getMessagesStorage();
                ArrayList arrayList = this.c;
                boolean z = this.d;
                messagesStorage.g1(arrayList, true, false, false, 0, false, z ? 1 : 0, 0L);
                hl.c3(new b6a(r7aVar2, this.e, (TLRPC.Message) tLObject2, this.h ? 1 : 0, z ? 1 : 0, (TLRPC.Message) tLObject, (r47) obj, this.s));
                break;
            default:
                uc7 uc7Var = (uc7) rf0Var;
                TLRPC.User user = (TLRPC.User) tLObject2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) tLObject;
                HashMap hashMap = (HashMap) obj;
                zh6 zh6Var = uc7Var.b1;
                LongSparseIntArray longSparseIntArray = uc7Var.x0;
                if (System.currentTimeMillis() - uc7Var.i1.get(user.id, 0L) > (user.bot ? 5000 : 60000)) {
                    uc7Var.f3(user, this.e, this.d, null);
                }
                if (userFull != null) {
                    if (zh6Var.f(user.id) == null) {
                        zh6Var.k(user.id, userFull);
                        uc7Var.i4.M(user.id);
                        jxa.v(uc7Var.currentAccount, false).N(userFull);
                        int indexOfKey = longSparseIntArray.indexOfKey(user.id);
                        if (userFull.blocked) {
                            if (indexOfKey < 0) {
                                longSparseIntArray.put(user.id, 1);
                                uc7Var.getNotificationCenter().k(44, new Object[0]);
                            }
                        } else if (indexOfKey >= 0) {
                            longSparseIntArray.removeAt(indexOfKey);
                            uc7Var.getNotificationCenter().k(44, new Object[0]);
                        }
                    }
                    uc7Var.getNotificationCenter().k(68, Long.valueOf(user.id), userFull);
                }
                uc7Var.getNotificationCenter().k(69, Long.valueOf(user.id), this.c, hashMap, Integer.valueOf(this.s), Boolean.valueOf(this.h));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u5a(r7a r7aVar, ArrayList arrayList, int i, int i2, TLRPC.Message message, int i3, TLRPC.Message message2, r47 r47Var, int i4, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = arrayList;
        this.d = i;
        this.e = i2;
        this.f = message;
        this.h = i3;
        this.n = message2;
        this.r = r47Var;
        this.s = i4;
    }
}
