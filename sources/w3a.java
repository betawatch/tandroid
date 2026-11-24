// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class w3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pg0 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ int s;

    public /* synthetic */ w3a(oc7 oc7Var, TLRPC.User user, int i, boolean z, TLRPC.UserFull userFull, ArrayList arrayList, HashMap hashMap, int i2, boolean z2) {
        this.a = (byte) 2;
        this.b = oc7Var;
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
        pg0 pg0Var = this.b;
        switch (b) {
            case 0:
                a6a a6aVar = (a6a) pg0Var;
                a6aVar.getMessagesStorage().a.c(new w3a(a6aVar, this.c, this.d ? 1 : 0, this.e, (TLRPC.Message) tLObject2, this.h ? 1 : 0, (TLRPC.Message) tLObject, (k47) obj, this.s, (byte) 1));
                break;
            case 1:
                a6a a6aVar2 = (a6a) pg0Var;
                cf7 messagesStorage = a6aVar2.getMessagesStorage();
                ArrayList arrayList = this.c;
                boolean z = this.d;
                messagesStorage.g1(arrayList, true, false, false, 0, false, z ? 1 : 0, 0L);
                gm.c3(new i4a(a6aVar2, this.e, (TLRPC.Message) tLObject2, this.h ? 1 : 0, z ? 1 : 0, (TLRPC.Message) tLObject, (k47) obj, this.s));
                break;
            default:
                oc7 oc7Var = (oc7) pg0Var;
                TLRPC.User user = (TLRPC.User) tLObject2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) tLObject;
                HashMap hashMap = (HashMap) obj;
                vh6 vh6Var = oc7Var.b1;
                LongSparseIntArray longSparseIntArray = oc7Var.x0;
                if (System.currentTimeMillis() - oc7Var.i1.get(user.id, 0L) > (user.bot ? 5000 : 60000)) {
                    oc7Var.b3(user, this.e, this.d, null);
                }
                if (userFull != null) {
                    if (vh6Var.f(user.id) == null) {
                        vh6Var.k(userFull, user.id);
                        oc7Var.i4.M(user.id);
                        jva.v(oc7Var.currentAccount, false).N(userFull);
                        int indexOfKey = longSparseIntArray.indexOfKey(user.id);
                        if (userFull.blocked) {
                            if (indexOfKey < 0) {
                                longSparseIntArray.put(user.id, 1);
                                oc7Var.getNotificationCenter().k(44, new Object[0]);
                            }
                        } else if (indexOfKey >= 0) {
                            longSparseIntArray.removeAt(indexOfKey);
                            oc7Var.getNotificationCenter().k(44, new Object[0]);
                        }
                    }
                    oc7Var.getNotificationCenter().k(68, Long.valueOf(user.id), userFull);
                }
                oc7Var.getNotificationCenter().k(69, Long.valueOf(user.id), this.c, hashMap, Integer.valueOf(this.s), Boolean.valueOf(this.h));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w3a(a6a a6aVar, ArrayList arrayList, int i, int i2, TLRPC.Message message, int i3, TLRPC.Message message2, k47 k47Var, int i4, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = arrayList;
        this.d = i;
        this.e = i2;
        this.f = message;
        this.h = i3;
        this.n = message2;
        this.r = k47Var;
        this.s = i4;
    }
}
