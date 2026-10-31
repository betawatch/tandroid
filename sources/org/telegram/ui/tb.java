package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb implements org.telegram.ui.Components.gk0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tb(zb zbVar, Context context, long j10, org.telegram.ui.ActionBar.p6 p6Var, u61 u61Var) {
        this.d = zbVar;
        this.c = context;
        this.b = j10;
        this.e = p6Var;
        this.f = u61Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d8, code lost:
    
        if (r14.user_id < 0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    @Override // org.telegram.ui.Components.gk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, View view) {
        u61 u61Var;
        long j10;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLObject tLObject = null;
        switch (this.a) {
            case 0:
                zb zbVar = (zb) this.d;
                Context context = this.c;
                long j11 = this.b;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.e;
                u61 u61Var2 = (u61) this.f;
                if (view instanceof rg.b) {
                    rg.b bVar = (rg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z10 = boost.giveaway;
                    if (!z10 || boost.stars <= 0) {
                        u61Var = u61Var2;
                        boolean z11 = boost.gift;
                        if (z11 || z10) {
                            j10 = -1;
                            break;
                        } else {
                            j10 = -1;
                        }
                        if (!boost.unclaimed) {
                            if (z10 && boost.user_id == j10) {
                                org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(u61Var.getParentActivity(), u61Var.getResourceProvider());
                                ebVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ebVar.b.setText(org.telegram.messenger.cd.L0(2131753303, null));
                                ebVar.b.setSingleLine(false);
                                ebVar.b.setMaxLines(2);
                                org.telegram.ui.Components.wb.g(u61Var, ebVar, 2750).j();
                            } else if (!z11 && !z10) {
                                u61Var.presentFragment(ProfileActivity.z4(bVar.getDialogId()));
                            }
                        }
                        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                        tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                        tL_payments_checkedGiftCode.to_id = boost.user_id;
                        tL_payments_checkedGiftCode.from_id = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).y1(-zbVar.I.id);
                        int i11 = boost.date;
                        tL_payments_checkedGiftCode.date = i11;
                        tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                        int i12 = boost.expires - i11;
                        tL_payments_checkedGiftCode.days = i12 / 86400;
                        tL_payments_checkedGiftCode.months = (i12 / 30) / 86400;
                        if (boost.unclaimed) {
                            tL_payments_checkedGiftCode.to_id = j10;
                            tL_payments_checkedGiftCode.flags = -1;
                        } else {
                            tL_payments_checkedGiftCode.boost = boost;
                        }
                        new mg.y0(u61Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                    } else {
                        u61Var = u61Var2;
                        rh.h8.g1(context, zbVar.b, j11, boost, p6Var);
                    }
                } else {
                    u61Var = u61Var2;
                }
                if (view instanceof org.telegram.ui.Cells.p8) {
                    mg.v.I0(u61Var, p6Var, j11, null);
                }
                if (view instanceof rg.c) {
                    mg.v.I0(u61Var, p6Var, j11, ((rg.c) view).getPrepaidGiveaway());
                }
                if (((yb) zbVar.y.get(i10)).a == 9) {
                    zbVar.c(Boolean.valueOf(zbVar.D == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.m60 m60Var = (org.telegram.ui.Components.m60) this.d;
                long j12 = this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.e;
                a0.h hVar = (a0.h) this.f;
                Context context2 = this.c;
                s4.g0 adapter = m60Var.k1.getAdapter();
                org.telegram.ui.Components.i60 i60Var = m60Var.N1;
                if (adapter == i60Var) {
                    int size = i60Var.c.size();
                    int size2 = m60Var.N1.e.e.size();
                    int size3 = m60Var.N1.e.d.size();
                    int i13 = i10 - 1;
                    if (i13 >= 0 && i13 < size) {
                        tLObject = (TLObject) m60Var.N1.c.get(i13);
                    } else if (i13 >= size && i13 < size3 + size) {
                        tLObject = (TLObject) m60Var.N1.e.d.get(i13 - size);
                    } else if (i13 > size + size3 && i13 <= size2 + size + size3) {
                        tLObject = (TLObject) m60Var.N1.e.e.get(((i13 - size) - size3) - 1);
                    }
                    if (m60Var.d2 != null) {
                        org.telegram.messenger.i0.v1(m60Var.s1.J);
                    }
                } else if (i10 == m60Var.O1) {
                    TLRPC.Chat L0 = org.telegram.messenger.vp.r1(m60Var.a).L0(Long.valueOf(j12));
                    TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(m60Var.a).M0(j12);
                    if (L0 != null) {
                        String K = org.telegram.messenger.w3.K(L0, false);
                        if (!TextUtils.isEmpty(K)) {
                            str = a1.g.o(org.telegram.messenger.vp.r1(m60Var.a).U2, "/", K, new StringBuilder("https://"));
                            if (str == null) {
                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                                m60Var.dismiss();
                                org.telegram.ui.Components.cc.j(k2Var).j();
                            }
                        }
                    }
                    if (M0 == null || (tL_chatInviteExported = M0.exported_invite) == null) {
                        if (!m60Var.p2) {
                            m60Var.p2 = true;
                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                            tL_messages_exportChatInvite.peer = org.telegram.messenger.vp.r1(m60Var.a).i1(-m60Var.m2);
                            ConnectionsManager.getInstance(m60Var.a).sendRequest(tL_messages_exportChatInvite, new org.telegram.ui.Components.x1(m60Var, 6));
                        }
                        str = null;
                    } else {
                        str = tL_chatInviteExported.link;
                    }
                    if (str == null) {
                    }
                } else if (i10 >= m60Var.P1 && i10 < m60Var.Q1) {
                    tLObject = ((org.telegram.ui.Components.g60) m60Var.m1).E(i10);
                }
                if (tLObject != null) {
                    long j13 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
                    if (hVar == null || hVar.h(j13) < 0) {
                        if (j13 != 0) {
                            if (m60Var.W1.h(j13) >= 0) {
                                org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) m60Var.W1.f(j13);
                                m60Var.W1.l(j13);
                                m60Var.L1.b(s20Var);
                            } else {
                                org.telegram.ui.Components.s20 s20Var2 = new org.telegram.ui.Components.s20(context2, tLObject);
                                s20Var2.setOnClickListener(m60Var.i2);
                                m60Var.W1.k(s20Var2, j13);
                                m60Var.L1.a(s20Var2, true);
                            }
                        }
                        m60Var.S0(true);
                        org.telegram.messenger.i0.a4(m60Var.k1);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ tb(org.telegram.ui.Components.m60 m60Var, long j10, org.telegram.ui.ActionBar.k2 k2Var, a0.h hVar, Context context) {
        this.d = m60Var;
        this.b = j10;
        this.e = k2Var;
        this.f = hVar;
        this.c = context;
    }
}
