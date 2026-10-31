package wh;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b2.p1;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import e2.j;
import e9.k0;
import e9.n0;
import e9.x1;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import org.telegram.messenger.o20;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.iu0;
import rh.e8;
import rh.g8;
import x2.l;
import xa.s;
import xa.v;
import xa.x;
import xh.i;
import xh.o;
import xh.r3;
import z3.h;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements iu0, l, Continuation, OnSuccessListener, OnCompleteListener, u1, o20, j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 12:
                h hVar = (h) this.b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.b, oa.d.o4(aVar.a, aVar.c));
                hVar.c.add(gVar);
                long j10 = hVar.j;
                if (j10 == -9223372036854775807L || aVar.d >= j10) {
                    hVar.g(gVar);
                    break;
                }
                break;
            default:
                ((k0) this.b).c((z3.a) obj);
                break;
        }
    }

    @Override // x2.l
    public x1 b(int i10, p1 p1Var, int[] iArr) {
        x2.j jVar = (x2.j) this.b;
        k0 t10 = n0.t();
        for (int i11 = 0; i11 < p1Var.a; i11++) {
            t10.c(new x2.g(i10, p1Var, i11, jVar, iArr[i11]));
        }
        return t10.f();
    }

    @Override // org.telegram.ui.Components.iu0
    public /* synthetic */ float f(RecyclerView recyclerView) {
        return f1.c(recyclerView);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 8:
                ((xh.d) this.b).run();
                break;
            default:
                i iVar = (i) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = iVar.getMessagesController().n1(iVar.R);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, iVar.getParentActivity(), null);
                x1Var2.r(150L);
                iVar.getConnectionsManager().sendRequest(updatestarrefprogram, new xh.b(iVar, x1Var2, 0));
                break;
        }
    }

    @Override // org.telegram.ui.Components.iu0
    public RecyclerView j(View view) {
        ((g8) this.b).getClass();
        return ((e8) view).a;
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.a) {
            case 10:
                o.Z((o) this.b, (a51) obj);
                break;
            default:
                ((r3) this.b).Z((a51) obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 5:
                v.b((Intent) this.b);
                break;
            case 6:
                ((x) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        s sVar = (s) obj;
        if (!((FirebaseMessaging) this.b).e.r() || sVar.h.a() == null) {
            return;
        }
        synchronized (sVar) {
            z10 = sVar.g;
        }
        if (z10) {
            return;
        }
        sVar.h(0L);
    }

    @Override // org.telegram.ui.Components.iu0
    public /* synthetic */ void p(RecyclerView recyclerView) {
        f1.b(recyclerView);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.a) {
            case 2:
                ((CountDownLatch) this.b).countDown();
                return null;
            default:
                ((j2.f) this.b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
