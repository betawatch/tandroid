// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class zf1 implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ c51 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ int e;
    public final /* synthetic */ nx0 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ vnb n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;

    public /* synthetic */ zf1(c51 c51Var, sjb sjbVar, uc7 uc7Var, long j, TLRPC.User user, String[] strArr, int i, nx0 nx0Var, boolean z, vnb vnbVar) {
        this.b = c51Var;
        this.r = sjbVar;
        this.s = uc7Var;
        this.c = j;
        this.d = user;
        this.w = strArr;
        this.e = i;
        this.f = nx0Var;
        this.h = z;
        this.n = vnbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.w;
        Object obj2 = this.s;
        Object obj3 = this.r;
        switch (b) {
            case 0:
                long[] jArr = (long[]) obj3;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj2;
                final Context context = (Context) obj;
                final c51 c51Var = this.b;
                if (!c51Var.R) {
                    c51Var.setLoading(true);
                    final long j = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i = this.e;
                    connectstarrefbot.bot = uc7.s1(i).o1(starrefprogram.bot_id);
                    connectstarrefbot.peer = uc7.s1(i).j1(j);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                    final nx0 nx0Var = this.f;
                    final long j2 = this.c;
                    final boolean z = this.h;
                    final vnb vnbVar = this.n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: ag1
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            hl.c3(new eg1(c51.this, tLObject, i, j, nx0Var, starrefprogram, j2, z, context, vnbVar, user, tL_error));
                        }
                    });
                    break;
                }
                break;
            default:
                sjb sjbVar = (sjb) obj3;
                zh8 zh8Var = sjbVar.h;
                final uc7 uc7Var = (uc7) obj2;
                String[] strArr = (String[]) obj;
                final c51 c51Var2 = this.b;
                if (!c51Var2.R) {
                    EditTextBoldCursor textView = zh8Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f = -sjbVar.E;
                        sjbVar.E = f;
                        hl.A3(f, textView, null);
                        yw0.E.a();
                        break;
                    } else {
                        c51Var2.setLoading(true);
                        hl.t1(zh8Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j3 = this.c;
                        tL_messages_editChatParticipantRank.peer = uc7Var.j1(j3);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = uc7.n1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        ic icVar = new ic((byte) 0);
                        final nx0 nx0Var2 = this.f;
                        final boolean z2 = this.h;
                        final vnb vnbVar2 = this.n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, icVar, new icc() { // from class: ljb
                            @Override // icc
                            public final void a(Object obj4, Object obj5) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj4;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                nx0 nx0Var3 = nx0Var2;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        ik8.u(nx0Var3.F, vnbVar2, tL_error, false);
                                        c51Var2.setLoading(false);
                                        return;
                                    }
                                    return;
                                }
                                long j4 = -j3;
                                long j5 = user2.id;
                                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                String str = tL_messages_editChatParticipantRank2.rank;
                                uc7 uc7Var2 = uc7.this;
                                uc7Var2.D5(j4, j5, str);
                                uc7Var2.Y3(updates, false);
                                nx0Var3.dismiss();
                                e S = LaunchActivity.S();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || S == null) {
                                    return;
                                }
                                v21 I = d31.b0(S).I(R.raw.contact_check, ob6.M0(z2 ? 2131743941 : 2131743940, null), tL_messages_editChatParticipantRank2.rank);
                                z11 z11Var = I.e;
                                if (z11Var.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) z11Var.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) z11Var.getLayoutParams()).gravity |= 1;
                                }
                                I.j();
                            }
                        });
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ zf1(c51 c51Var, long[] jArr, int i, TL_payments.starRefProgram starrefprogram, nx0 nx0Var, long j, boolean z, Context context, vnb vnbVar, TLRPC.User user) {
        this.b = c51Var;
        this.r = jArr;
        this.e = i;
        this.s = starrefprogram;
        this.f = nx0Var;
        this.c = j;
        this.h = z;
        this.w = context;
        this.n = vnbVar;
        this.d = user;
    }
}
