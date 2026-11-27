// default package

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qkc implements zv5, fd {
    public final /* synthetic */ TLRPC.User a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Activity h;
    public final /* synthetic */ e n;
    public final /* synthetic */ k5 r;

    public /* synthetic */ qkc(TLRPC.User user, TLRPC.Chat chat, String str, boolean z, boolean z2, boolean z3, Activity activity, e eVar, k5 k5Var) {
        this.a = user;
        this.b = chat;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.h = activity;
        this.n = eVar;
        this.r = k5Var;
    }

    @Override // zv5
    public final void a(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3) {
        boolean z4 = this.d;
        Activity activity = this.h;
        k5 k5Var = this.r;
        TLRPC.Chat chat = this.b;
        String str = this.c;
        if (z4 && z2) {
            j95.T0((LaunchActivity) activity, k5Var, chat, inputPeer, z, str);
            return;
        }
        TLRPC.User user = this.a;
        boolean z5 = this.e;
        boolean z6 = this.f;
        e eVar = this.n;
        if (z || str == null) {
            xkc.b(user, chat, str, inputPeer, z, z5, z6, z4, activity, eVar, k5Var, false, true, z3);
            return;
        }
        wkc wkcVar = new wkc(activity, chat, user, chat, str, inputPeer, z5, z6, z4, activity, eVar, k5Var, z3);
        if (eVar != null) {
            eVar.showDialog(wkcVar);
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.a;
        final TLRPC.Chat chat = this.b;
        final String str = this.c;
        final boolean z = this.d;
        final boolean z2 = this.e;
        final boolean z3 = this.f;
        final Activity activity = this.h;
        final e eVar = this.n;
        final k5 k5Var = this.r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() { // from class: skc
                @Override // java.lang.Runnable
                public final void run() {
                    xkc.a = 0L;
                    xkc.b(TLRPC.User.this, chat, str, null, false, z, z2, z3, activity, eVar, k5Var, true, true, false);
                }
            });
        } else {
            xkc.b(user, chat, str, null, false, z, z2, z3, activity, eVar, k5Var, true, true, false);
        }
    }

    public /* synthetic */ qkc(boolean z, Activity activity, k5 k5Var, TLRPC.Chat chat, String str, TLRPC.User user, boolean z2, boolean z3, e eVar) {
        this.d = z;
        this.h = activity;
        this.r = k5Var;
        this.b = chat;
        this.c = str;
        this.a = user;
        this.e = z2;
        this.f = z3;
        this.n = eVar;
    }
}
