// default package

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class vo9 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ vo9(int i, c51 c51Var, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z, boolean z2, nx0[] nx0VarArr) {
        this.e = c51Var;
        this.f = nx0VarArr;
        this.d = i;
        this.b = z;
        this.h = starsSubscription;
        this.c = z2;
        this.n = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, jp9] */
    /* JADX WARN: Type inference failed for: r5v2, types: [jp9] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        jp9 jp9Var;
        File file2;
        int i;
        switch (this.a) {
            case 0:
                ?? r5 = (jp9) this.e;
                bo9 bo9Var = (bo9) this.f;
                boolean z = this.b;
                File file3 = (File) this.h;
                ?? r12 = this.c;
                int i2 = this.d;
                fp9 fp9Var = (fp9) this.n;
                r5.getClass();
                long nanoTime = System.nanoTime();
                try {
                    try {
                        bo9Var.g();
                        r5.m.b("preview output finalized: size=" + bo9Var.a.length() + ", replace=" + z + ", elapsedMs=" + jp9.f(nanoTime));
                        r5.g();
                        try {
                            if (z) {
                                synchronized (bo9Var) {
                                    try {
                                        i = bo9Var.s;
                                    } catch (Throwable th) {
                                        th = th;
                                        while (true) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                    }
                                }
                                r5.u(file3, i, r5.K, r5.L, r12, i2);
                                file2 = file3;
                                jp9Var = r5;
                            } else {
                                r12 = file3;
                                File file4 = bo9Var.a;
                                long j = r5.O;
                                if (j <= 0) {
                                    j = r5.I;
                                }
                                ExecutorService executorService = r5.k;
                                try {
                                    yo9 yo9Var = new yo9((jp9) r5, fp9Var, file4, j, true);
                                    jp9Var = r5;
                                    executorService.execute(yo9Var);
                                    file2 = r12;
                                } catch (Exception e) {
                                    e = e;
                                    r5 = r5;
                                    r5.i.post(new wo9(r5, e, (byte) 0));
                                    if (r12 != 0) {
                                        uxe.c(r12);
                                    }
                                    if (z) {
                                        file = bo9Var.a;
                                        uxe.c(file);
                                        return;
                                    }
                                    return;
                                }
                            }
                            jp9Var.V = null;
                            if (file2 != null) {
                                uxe.c(file2);
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (r12 != 0) {
                            uxe.c(r12);
                        }
                        if (z) {
                            uxe.c(bo9Var.a);
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    r12 = file3;
                } catch (Throwable th4) {
                    th = th4;
                    r12 = file3;
                    if (r12 != 0) {
                    }
                    if (z) {
                    }
                    throw th;
                }
                if (z) {
                    file = bo9Var.a;
                    uxe.c(file);
                    return;
                }
                return;
            case 1:
                r7a r7aVar = (r7a) this.e;
                boolean z2 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.f;
                ArrayList arrayList = (ArrayList) this.h;
                boolean z3 = this.c;
                ArrayList arrayList2 = (ArrayList) this.n;
                int i3 = this.d;
                r7aVar.getMessagesController().Z(arrayList, null, null, message.dialog_id, false, z3 ? 1 : 0, false, 0L, null, 0, !z3 && z2, (!z2 || message == null) ? 0 : message.id);
                r7aVar.getMessagesController().z5(z2 ? 1 : 0, message.dialog_id, arrayList2);
                r7aVar.getMediaDataController().x0(message.dialog_id);
                r7aVar.c0(i3);
                r7aVar.h0(i3, z3);
                return;
            default:
                c51 c51Var = (c51) this.e;
                nx0[] nx0VarArr = (nx0[]) this.f;
                int i4 = this.d;
                boolean z4 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z5 = this.c;
                TLObject tLObject = (TLObject) this.n;
                c51Var.setLoading(false);
                nx0 nx0Var = nx0VarArr[0];
                if (nx0Var != null) {
                    nx0Var.dismiss();
                }
                jxa.v(i4, false).P();
                e S = LaunchActivity.S();
                if (S != null) {
                    d31.b0(S).V(Collections.singletonList(tLObject), ob6.M0(2131744654, null), hl.S2((!z4 || TextUtils.isEmpty(starsSubscription.title)) ? (!z5 || TextUtils.isEmpty(starsSubscription.title)) ? ob6.a0(null, null, 2131744653, ob6.u(starsSubscription.until_date, false)) : ob6.a0(null, null, 2131744656, ob6.u(starsSubscription.until_date, false), starsSubscription.title) : ob6.a0(null, null, 2131744657, ob6.u(starsSubscription.until_date, false), starsSubscription.title)), null).k(false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ vo9(jp9 jp9Var, bo9 bo9Var, boolean z, File file, boolean z2, int i, fp9 fp9Var) {
        this.e = jp9Var;
        this.f = bo9Var;
        this.b = z;
        this.h = file;
        this.c = z2;
        this.d = i;
        this.n = fp9Var;
    }

    public /* synthetic */ vo9(r7a r7aVar, boolean z, TLRPC.Message message, ArrayList arrayList, boolean z2, ArrayList arrayList2, int i) {
        this.e = r7aVar;
        this.b = z;
        this.f = message;
        this.h = arrayList;
        this.c = z2;
        this.n = arrayList2;
        this.d = i;
    }
}
