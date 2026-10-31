package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t60 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:287:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05ae  */
    @Override // org.telegram.ui.ActionBar.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10) {
        long j10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        ja0 ja0Var;
        String obj;
        boolean z13;
        Bitmap bitmap;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i12 = this.a;
        org.telegram.ui.ActionBar.k kVar = null;
        final int i13 = 0;
        boolean z14 = true;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                if (i10 == -1) {
                    ((y60) obj2).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 2:
                final ma0 ma0Var = (ma0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        long j11 = ma0Var.b;
                        ArrayList arrayList = ma0Var.Q;
                        ArrayList arrayList2 = ma0Var.O;
                        if (!ma0Var.U) {
                            int selectedIndex = ma0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                org.telegram.messenger.i0.E3(ma0Var.x);
                                Vibrator vibrator = (Vibrator) ma0Var.x.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.t8 t8Var = ma0Var.n;
                                if (t8Var != null && t8Var.e.h) {
                                    try {
                                        j10 = Long.parseLong(ma0Var.r.d.getText().toString());
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    i11 = ma0Var.a;
                                    if (i11 != 0) {
                                        org.telegram.ui.ActionBar.x1 x1Var = ma0Var.T;
                                        if (x1Var != null) {
                                            x1Var.dismiss();
                                        }
                                        ma0Var.U = true;
                                        org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, ma0Var.getParentActivity(), null);
                                        ma0Var.T = x1Var2;
                                        x1Var2.r(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = ma0Var.getMessagesController().i1(-j11);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = ma0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = ma0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = ma0Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        ja0 ja0Var2 = ma0Var.f;
                                        r8 = ja0Var2 != null && ja0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = r8;
                                        if (r8) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj3 = ma0Var.K.getText().toString();
                                        tL_messages_exportChatInvite.title = obj3;
                                        if (!TextUtils.isEmpty(obj3)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j10 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = ma0Var.getConnectionsManager().isTestBackend() ? org.telegram.messenger.zs.X4 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                        }
                                        ma0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.da0
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i13) {
                                                    case 0:
                                                        final int i14 = 0;
                                                        final ma0 ma0Var2 = ma0Var;
                                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ea0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        ma0 ma0Var3 = ma0Var2;
                                                                        ma0Var3.U = false;
                                                                        org.telegram.ui.ActionBar.x1 x1Var3 = ma0Var3.T;
                                                                        if (x1Var3 != null) {
                                                                            x1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.s4.t0(ma0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            la0 la0Var = ma0Var3.S;
                                                                            if (la0Var != null) {
                                                                                la0Var.c(tLObject);
                                                                            }
                                                                            ma0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        ma0 ma0Var4 = ma0Var2;
                                                                        ma0Var4.U = false;
                                                                        org.telegram.ui.ActionBar.x1 x1Var4 = ma0Var4.T;
                                                                        if (x1Var4 != null) {
                                                                            x1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.s4.t0(ma0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                ma0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            la0 la0Var2 = ma0Var4.S;
                                                                            if (la0Var2 != null) {
                                                                                la0Var2.b(ma0Var4.e, tLObject2);
                                                                            }
                                                                            ma0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i15 = 1;
                                                        final ma0 ma0Var3 = ma0Var;
                                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ea0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i15) {
                                                                    case 0:
                                                                        ma0 ma0Var32 = ma0Var3;
                                                                        ma0Var32.U = false;
                                                                        org.telegram.ui.ActionBar.x1 x1Var3 = ma0Var32.T;
                                                                        if (x1Var3 != null) {
                                                                            x1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.s4.t0(ma0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            la0 la0Var = ma0Var32.S;
                                                                            if (la0Var != null) {
                                                                                la0Var.c(tLObject);
                                                                            }
                                                                            ma0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        ma0 ma0Var4 = ma0Var3;
                                                                        ma0Var4.U = false;
                                                                        org.telegram.ui.ActionBar.x1 x1Var4 = ma0Var4.T;
                                                                        if (x1Var4 != null) {
                                                                            x1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.s4.t0(ma0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                ma0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            la0 la0Var2 = ma0Var4.S;
                                                                            if (la0Var2 != null) {
                                                                                la0Var2.b(ma0Var4.e, tLObject2);
                                                                            }
                                                                            ma0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    } else if (i11 == 1) {
                                        org.telegram.ui.ActionBar.x1 x1Var3 = ma0Var.T;
                                        if (x1Var3 != null) {
                                            x1Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = ma0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = ma0Var.getMessagesController().i1(-j11);
                                        int selectedIndex4 = ma0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (ma0Var.V != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = ma0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (ma0Var.V != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = ma0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            z11 = z10;
                                            if (ma0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z11 = true;
                                            }
                                            z12 = ma0Var.e.request_needed;
                                            ja0Var = ma0Var.f;
                                            if (z12 != (ja0Var == null && ja0Var.e.h)) {
                                                int i14 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i14 | 8;
                                                boolean z15 = ja0Var != null && ja0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z15;
                                                if (z15) {
                                                    tL_messages_editExportedChatInvite.flags = i14 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z11 = true;
                                            }
                                            obj = ma0Var.K.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(ma0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z13 = true;
                                            }
                                            if (!z13) {
                                                ma0Var.U = true;
                                                org.telegram.ui.ActionBar.x1 x1Var4 = new org.telegram.ui.ActionBar.x1(3, ma0Var.getParentActivity(), null);
                                                ma0Var.T = x1Var4;
                                                x1Var4.r(500L);
                                                ConnectionsManager connectionsManager = ma0Var.getConnectionsManager();
                                                final int i15 = r8 ? 1 : 0;
                                                connectionsManager.sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.da0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (i15) {
                                                            case 0:
                                                                final int i142 = 0;
                                                                final ma0 ma0Var2 = ma0Var;
                                                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ea0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i142) {
                                                                            case 0:
                                                                                ma0 ma0Var32 = ma0Var2;
                                                                                ma0Var32.U = false;
                                                                                org.telegram.ui.ActionBar.x1 x1Var32 = ma0Var32.T;
                                                                                if (x1Var32 != null) {
                                                                                    x1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.s4.t0(ma0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    la0 la0Var = ma0Var32.S;
                                                                                    if (la0Var != null) {
                                                                                        la0Var.c(tLObject);
                                                                                    }
                                                                                    ma0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                ma0 ma0Var4 = ma0Var2;
                                                                                ma0Var4.U = false;
                                                                                org.telegram.ui.ActionBar.x1 x1Var42 = ma0Var4.T;
                                                                                if (x1Var42 != null) {
                                                                                    x1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.s4.t0(ma0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        ma0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    la0 la0Var2 = ma0Var4.S;
                                                                                    if (la0Var2 != null) {
                                                                                        la0Var2.b(ma0Var4.e, tLObject2);
                                                                                    }
                                                                                    ma0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i152 = 1;
                                                                final ma0 ma0Var3 = ma0Var;
                                                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ea0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i152) {
                                                                            case 0:
                                                                                ma0 ma0Var32 = ma0Var3;
                                                                                ma0Var32.U = false;
                                                                                org.telegram.ui.ActionBar.x1 x1Var32 = ma0Var32.T;
                                                                                if (x1Var32 != null) {
                                                                                    x1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.s4.t0(ma0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    la0 la0Var = ma0Var32.S;
                                                                                    if (la0Var != null) {
                                                                                        la0Var.c(tLObject);
                                                                                    }
                                                                                    ma0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                ma0 ma0Var4 = ma0Var3;
                                                                                ma0Var4.U = false;
                                                                                org.telegram.ui.ActionBar.x1 x1Var42 = ma0Var4.T;
                                                                                if (x1Var42 != null) {
                                                                                    x1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.s4.t0(ma0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        ma0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    la0 la0Var2 = ma0Var4.S;
                                                                                    if (la0Var2 != null) {
                                                                                        la0Var2.b(ma0Var4.e, tLObject2);
                                                                                    }
                                                                                    ma0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            } else {
                                                ma0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            z11 = z10;
                                            if (ma0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z11 = true;
                                            }
                                            z12 = ma0Var.e.request_needed;
                                            ja0Var = ma0Var.f;
                                            if (z12 != (ja0Var == null && ja0Var.e.h)) {
                                            }
                                            obj = ma0Var.K.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(ma0Var.e.title, obj)) {
                                            }
                                            if (!z13) {
                                            }
                                        }
                                    }
                                }
                                j10 = 0;
                                i11 = ma0Var.a;
                                if (i11 != 0) {
                                }
                            }
                        }
                    }
                } else {
                    ma0Var.finishFragment();
                    org.telegram.messenger.i0.v1(ma0Var.F);
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((bb0) obj2).finishFragment();
                    break;
                }
                break;
            case 4:
                hf0 hf0Var = (hf0) obj2;
                if (i10 != 1) {
                    if (i10 == -1 && hf0Var.onBackPressed(true)) {
                        hf0Var.finishFragment();
                        break;
                    }
                } else {
                    hf0Var.x1();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((jf0) obj2).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((kg0) obj2).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((kg.q1) obj2).finishFragment();
                    break;
                }
                break;
            case 8:
                sh0 sh0Var = (sh0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", sh0Var.b);
                        sh0Var.presentFragment(new u61(bundle));
                        break;
                    }
                } else {
                    sh0Var.finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((PasscodeActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((PasskeysActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 13:
                yn0 yn0Var = (yn0) obj2;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            yn0.Y(yn0Var, null);
                            break;
                        }
                    } else if (yn0Var.V != null) {
                        yn0Var.finishFragment(false);
                        yn0Var.V.V();
                        break;
                    }
                } else {
                    yn0Var.finishFragment();
                    break;
                }
                break;
            case 14:
                bo0 bo0Var = (bo0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (bo0Var.c != null && !bo0Var.f) {
                            zn0 zn0Var = bo0Var.d;
                            float f7 = zn0Var.f - zn0Var.y;
                            float f10 = zn0Var.w;
                            float f11 = f7 / f10;
                            float f12 = (zn0Var.h - zn0Var.D) / zn0Var.x;
                            float f13 = zn0Var.d / f10;
                            float f14 = zn0Var.e / f10;
                            bo0 bo0Var2 = zn0Var.H;
                            int width = (int) (f11 * bo0Var2.a.getWidth());
                            int height = (int) (f12 * bo0Var2.a.getHeight());
                            int width2 = (int) (f13 * bo0Var2.a.getWidth());
                            int width3 = (int) (f14 * bo0Var2.a.getWidth());
                            int i16 = width < 0 ? 0 : width;
                            int i17 = height < 0 ? 0 : height;
                            if (i16 + width2 > bo0Var2.a.getWidth()) {
                                width2 = bo0Var2.a.getWidth() - i16;
                            }
                            int i18 = width2;
                            if (i17 + width3 > bo0Var2.a.getHeight()) {
                                width3 = bo0Var2.a.getHeight() - i17;
                            }
                            int i19 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(bo0Var2.a, i16, i17, i18, i19, (Matrix) null, false);
                            } catch (Throwable th2) {
                                org.telegram.messenger.f8.g(th2, true);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(bo0Var2.a, i16, i17, i18, i19, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    org.telegram.messenger.f8.g(th3, true);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == bo0Var.a) {
                                bo0Var.e = true;
                            }
                            ((org.telegram.ui.Components.b40) bo0Var.c).r(false, bitmap, null);
                            bo0Var.f = true;
                        }
                        bo0Var.finishFragment();
                        break;
                    }
                } else {
                    bo0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                lo0 lo0Var = (lo0) obj2;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ko0 ko0Var = lo0Var.s0;
                            if (ko0Var != null) {
                                ko0Var.h0();
                            }
                            lo0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z16 = lo0Var.Y;
                        lo0Var.Y = !z16;
                        if (z16) {
                            lo0Var.K.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(50.0f));
                        } else {
                            lo0Var.K.setPadding(0, 0, 0, org.telegram.messenger.i0.L(48.0f));
                        }
                        lo0Var.K.C0();
                        lo0Var.M.h1(0, 0);
                        lo0Var.L.f();
                        break;
                    }
                } else {
                    lo0Var.finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((oo0) obj2).finishFragment();
                    break;
                }
                break;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj2;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            int i20 = PopupNotificationActivity.b0;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i21 = PopupNotificationActivity.b0;
                        popupNotificationActivity.k();
                        break;
                    }
                } else {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    break;
                }
                break;
            case 18:
                rt0 rt0Var = (rt0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        rt0Var.c0();
                        break;
                    }
                } else if (rt0Var.onBackPressed(true)) {
                    rt0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj2).finishFragment();
                    break;
                }
                break;
            case 20:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        privacyControlActivity.D0();
                        break;
                    }
                } else if (privacyControlActivity.z0(true)) {
                    privacyControlActivity.finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((av0) obj2).finishFragment();
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (i10 == -1) {
                    ix0 ix0Var = profileActivity.N;
                    if (ix0Var == null || !ix0Var.T(true)) {
                        if (!profileActivity.I0) {
                            profileActivity.finishFragment();
                            break;
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", profileActivity.e1);
                            bundle2.putLong("user_id", profileActivity.d1);
                            profileActivity.presentFragment(new qh.i0(bundle2));
                            break;
                        }
                    }
                } else {
                    lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                    if (lVar != null) {
                        lVar2 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                        kVar = lVar2.getActionBarMenuOnItemClick();
                    }
                    if (kVar != null) {
                        kVar.b(i10);
                        break;
                    }
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((ProxyListActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 25:
                jz0 jz0Var = (jz0) obj2;
                boolean z17 = jz0Var.I;
                org.telegram.messenger.sz szVar = jz0Var.J;
                if (i10 != -1) {
                    if (i10 == 1 && jz0Var.getParentActivity() != null) {
                        ji.a a2 = ji.b.a();
                        int i22 = jz0Var.w;
                        if (i22 == 0) {
                            i22 = 1;
                        }
                        a2.a = i22;
                        String obj4 = jz0Var.a[0].getText().toString();
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        a2.c = obj4;
                        a2.b = jz0Var.w == 3 ? 0 : Utilities.z(jz0Var.a[1].getText().toString()).intValue();
                        String obj5 = jz0Var.w == 1 ? jz0Var.a[2].getText().toString() : "";
                        if (obj5 == null) {
                            obj5 = "";
                        }
                        a2.d = obj5;
                        String obj6 = jz0Var.w == 1 ? jz0Var.a[3].getText().toString() : "";
                        if (obj6 == null) {
                            obj6 = "";
                        }
                        a2.e = obj6;
                        String obj7 = jz0Var.w != 1 ? jz0Var.a[4].getText().toString() : "";
                        a2.f = obj7 != null ? obj7 : "";
                        szVar.a = a2.d();
                        SharedPreferences d12 = org.telegram.messenger.vp.d1();
                        SharedPreferences.Editor edit = d12.edit();
                        if (z17) {
                            org.telegram.messenger.tz.a(szVar);
                            org.telegram.messenger.tz.B1 = szVar;
                            edit.putBoolean("proxy_enabled", true);
                        } else {
                            z14 = d12.getBoolean("proxy_enabled", false);
                            org.telegram.messenger.tz.z();
                        }
                        if (z17 || org.telegram.messenger.tz.B1 == szVar) {
                            szVar.a.h(edit);
                            ConnectionsManager.setProxySettings(z14, szVar.a);
                        }
                        edit.commit();
                        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.A4, new Object[0]);
                        jz0Var.finishFragment();
                        break;
                    }
                } else {
                    jz0Var.finishFragment();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((pz0) obj2).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((e01) obj2).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((l01) obj2).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
        }
    }
}
