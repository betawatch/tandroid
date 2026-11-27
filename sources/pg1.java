// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pg1 implements r69 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pg1(tg1 tg1Var, Context context, long j, vnb vnbVar, w1b w1bVar) {
        this.d = tg1Var;
        this.c = context;
        this.b = j;
        this.e = vnbVar;
        this.f = w1bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cf, code lost:
    
        if (r14.user_id < 0) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    @Override // r69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i, View view) {
        long j;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLObject tLObject = null;
        switch (this.a) {
            case 0:
                tg1 tg1Var = (tg1) this.d;
                Context context = this.c;
                long j2 = this.b;
                vnb vnbVar = (vnb) this.e;
                w1b w1bVar = (w1b) this.f;
                if (view instanceof zx4) {
                    zx4 zx4Var = (zx4) view;
                    TL_stories.Boost boost = zx4Var.getBoost();
                    boolean z = boost.giveaway;
                    if (!z || boost.stars <= 0) {
                        boolean z2 = boost.gift;
                        if (z2 || z) {
                            j = -1;
                            break;
                        } else {
                            j = -1;
                        }
                        if (!boost.unclaimed) {
                            if (z && boost.user_id == j) {
                                c21 c21Var = new c21(w1bVar.getParentActivity(), w1bVar.getResourceProvider());
                                c21Var.g(R.raw.chats_infotip, 36, 36, new String[0]);
                                c21Var.b.setText(ob6.M0(2131753296, null));
                                c21Var.b.setSingleLine(false);
                                c21Var.b.setMaxLines(2);
                                v21.g(w1bVar, c21Var, 2750).j();
                            } else if (!z2 && !z) {
                                w1bVar.presentFragment(ProfileActivity.Q2(zx4Var.getDialogId()));
                            }
                        }
                        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                        tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                        tL_payments_checkedGiftCode.to_id = boost.user_id;
                        tL_payments_checkedGiftCode.from_id = uc7.s1(yac.t0).y1(-tg1Var.J.id);
                        int i2 = boost.date;
                        tL_payments_checkedGiftCode.date = i2;
                        tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                        int i3 = boost.expires - i2;
                        tL_payments_checkedGiftCode.days = i3 / 86400;
                        tL_payments_checkedGiftCode.months = (i3 / 30) / 86400;
                        if (boost.unclaimed) {
                            tL_payments_checkedGiftCode.to_id = j;
                            tL_payments_checkedGiftCode.flags = -1;
                        } else {
                            tL_payments_checkedGiftCode.boost = boost;
                        }
                        new tv4(w1bVar, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                    } else {
                        nza.i1(context, tg1Var.b, j2, boost, vnbVar);
                    }
                }
                if (view instanceof skb) {
                    dn0.E0(w1bVar, vnbVar, j2, null);
                }
                if (view instanceof cy4) {
                    dn0.E0(w1bVar, vnbVar, j2, ((cy4) view).getPrepaidGiveaway());
                }
                if (((sg1) tg1Var.y.get(i)).a == 9) {
                    tg1Var.c(Boolean.valueOf(tg1Var.E == 1));
                    break;
                }
                break;
            default:
                lt5 lt5Var = (lt5) this.d;
                long j3 = this.b;
                e eVar = (e) this.e;
                zh6 zh6Var = (zh6) this.f;
                Context context2 = this.c;
                j79 adapter = lt5Var.n1.getAdapter();
                ht5 ht5Var = lt5Var.Q1;
                if (adapter == ht5Var) {
                    int size = ht5Var.c.size();
                    int size2 = lt5Var.Q1.e.e.size();
                    int size3 = lt5Var.Q1.e.d.size();
                    int i4 = i - 1;
                    if (i4 >= 0 && i4 < size) {
                        tLObject = (TLObject) lt5Var.Q1.c.get(i4);
                    } else if (i4 >= size && i4 < size3 + size) {
                        tLObject = (TLObject) lt5Var.Q1.e.d.get(i4 - size);
                    } else if (i4 > size + size3 && i4 <= size2 + size + size3) {
                        tLObject = (TLObject) lt5Var.Q1.e.e.get(((i4 - size) - size3) - 1);
                    }
                    if (lt5Var.g2 != null) {
                        hl.t1(lt5Var.v1.L);
                    }
                } else if (i == lt5Var.R1) {
                    TLRPC.Chat M0 = uc7.s1(lt5Var.a).M0(Long.valueOf(j3));
                    TLRPC.ChatFull N0 = uc7.s1(lt5Var.a).N0(j3);
                    if (M0 != null) {
                        String K = xc2.K(M0, false);
                        if (!TextUtils.isEmpty(K)) {
                            str = qu6.o(uc7.s1(lt5Var.a).N2, "/", K, new StringBuilder("https://"));
                            if (str == null) {
                                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                                lt5Var.dismiss();
                                d31.j(eVar).j();
                            }
                        }
                    }
                    if (N0 == null || (tL_chatInviteExported = N0.exported_invite) == null) {
                        if (!lt5Var.s2) {
                            lt5Var.s2 = true;
                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                            tL_messages_exportChatInvite.peer = uc7.s1(lt5Var.a).j1(-lt5Var.p2);
                            ConnectionsManager.getInstance(lt5Var.a).sendRequest(tL_messages_exportChatInvite, new w15(lt5Var, (byte) 5));
                        }
                        str = null;
                    } else {
                        str = tL_chatInviteExported.link;
                    }
                    if (str == null) {
                    }
                } else if (i >= lt5Var.S1 && i < lt5Var.T1) {
                    tLObject = ((ft5) lt5Var.p1).E(i);
                }
                if (tLObject != null) {
                    long j4 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
                    if (zh6Var == null || zh6Var.h(j4) < 0) {
                        if (j4 != 0) {
                            if (lt5Var.Z1.h(j4) >= 0) {
                                zc5 zc5Var = (zc5) lt5Var.Z1.f(j4);
                                lt5Var.Z1.l(j4);
                                lt5Var.O1.b(zc5Var);
                            } else {
                                zc5 zc5Var2 = new zc5(context2, tLObject);
                                zc5Var2.setOnClickListener(lt5Var.l2);
                                lt5Var.Z1.k(j4, zc5Var2);
                                lt5Var.O1.a(zc5Var2, true);
                            }
                        }
                        lt5Var.O0(true);
                        hl.V3(lt5Var.n1);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ pg1(lt5 lt5Var, long j, e eVar, zh6 zh6Var, Context context) {
        this.d = lt5Var;
        this.b = j;
        this.e = eVar;
        this.f = zh6Var;
        this.c = context;
    }
}
