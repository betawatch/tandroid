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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s60 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s60(Object obj, int i10) {
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
        ia0 ia0Var;
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
                    ((x60) obj2).finishFragment();
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
                final la0 la0Var = (la0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        long j11 = la0Var.b;
                        ArrayList arrayList = la0Var.Q;
                        ArrayList arrayList2 = la0Var.O;
                        if (!la0Var.U) {
                            int selectedIndex = la0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                org.telegram.messenger.i0.E3(la0Var.x);
                                Vibrator vibrator = (Vibrator) la0Var.x.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.t8 t8Var = la0Var.n;
                                if (t8Var != null && t8Var.e.h) {
                                    try {
                                        j10 = Long.parseLong(la0Var.r.d.getText().toString());
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    i11 = la0Var.a;
                                    if (i11 != 0) {
                                        org.telegram.ui.ActionBar.x1 x1Var = la0Var.T;
                                        if (x1Var != null) {
                                            x1Var.dismiss();
                                        }
                                        la0Var.U = true;
                                        org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, la0Var.getParentActivity(), null);
                                        la0Var.T = x1Var2;
                                        x1Var2.r(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = la0Var.getMessagesController().i1(-j11);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = la0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = la0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = la0Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        ia0 ia0Var2 = la0Var.f;
                                        r8 = ia0Var2 != null && ia0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = r8;
                                        if (r8) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj3 = la0Var.K.getText().toString();
                                        tL_messages_exportChatInvite.title = obj3;
                                        if (!TextUtils.isEmpty(obj3)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j10 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = la0Var.getConnectionsManager().isTestBackend() ? org.telegram.messenger.at.X4 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                        }
                                        la0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ca0
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i13) {
                                                    case 0:
                                                        final int i14 = 0;
                                                        final la0 la0Var2 = la0Var;
                                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.da0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        la0 la0Var3 = la0Var2;
                                                                        la0Var3.U = false;
                                                                        org.telegram.ui.ActionBar.x1 x1Var3 = la0Var3.T;
                                                                        if (x1Var3 != null) {
                                                                            x1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.s4.t0(la0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            ka0 ka0Var = la0Var3.S;
                                                                            if (ka0Var != null) {
                                                                                ka0Var.c(tLObject);
                                                                            }
                                                                            la0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        la0 la0Var4 = la0Var2;
                                                                        la0Var4.U = false;
                                                                        org.telegram.ui.ActionBar.x1 x1Var4 = la0Var4.T;
                                                                        if (x1Var4 != null) {
                                                                            x1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.s4.t0(la0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                la0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            ka0 ka0Var2 = la0Var4.S;
                                                                            if (ka0Var2 != null) {
                                                                                ka0Var2.b(la0Var4.e, tLObject2);
                                                                            }
                                                                            la0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i15 = 1;
                                                        final la0 la0Var3 = la0Var;
                                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.da0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i15) {
                                                                    case 0:
                                                                        la0 la0Var32 = la0Var3;
                                                                        la0Var32.U = false;
                                                                        org.telegram.ui.ActionBar.x1 x1Var3 = la0Var32.T;
                                                                        if (x1Var3 != null) {
                                                                            x1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.s4.t0(la0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            ka0 ka0Var = la0Var32.S;
                                                                            if (ka0Var != null) {
                                                                                ka0Var.c(tLObject);
                                                                            }
                                                                            la0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        la0 la0Var4 = la0Var3;
                                                                        la0Var4.U = false;
                                                                        org.telegram.ui.ActionBar.x1 x1Var4 = la0Var4.T;
                                                                        if (x1Var4 != null) {
                                                                            x1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.s4.t0(la0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                la0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            ka0 ka0Var2 = la0Var4.S;
                                                                            if (ka0Var2 != null) {
                                                                                ka0Var2.b(la0Var4.e, tLObject2);
                                                                            }
                                                                            la0Var4.finishFragment();
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
                                        org.telegram.ui.ActionBar.x1 x1Var3 = la0Var.T;
                                        if (x1Var3 != null) {
                                            x1Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = la0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = la0Var.getMessagesController().i1(-j11);
                                        int selectedIndex4 = la0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (la0Var.V != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = la0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (la0Var.V != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = la0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            z11 = z10;
                                            if (la0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z11 = true;
                                            }
                                            z12 = la0Var.e.request_needed;
                                            ia0Var = la0Var.f;
                                            if (z12 != (ia0Var == null && ia0Var.e.h)) {
                                                int i14 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i14 | 8;
                                                boolean z15 = ia0Var != null && ia0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z15;
                                                if (z15) {
                                                    tL_messages_editExportedChatInvite.flags = i14 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z11 = true;
                                            }
                                            obj = la0Var.K.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(la0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z13 = true;
                                            }
                                            if (!z13) {
                                                la0Var.U = true;
                                                org.telegram.ui.ActionBar.x1 x1Var4 = new org.telegram.ui.ActionBar.x1(3, la0Var.getParentActivity(), null);
                                                la0Var.T = x1Var4;
                                                x1Var4.r(500L);
                                                ConnectionsManager connectionsManager = la0Var.getConnectionsManager();
                                                final int i15 = r8 ? 1 : 0;
                                                connectionsManager.sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ca0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (i15) {
                                                            case 0:
                                                                final int i142 = 0;
                                                                final la0 la0Var2 = la0Var;
                                                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.da0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i142) {
                                                                            case 0:
                                                                                la0 la0Var32 = la0Var2;
                                                                                la0Var32.U = false;
                                                                                org.telegram.ui.ActionBar.x1 x1Var32 = la0Var32.T;
                                                                                if (x1Var32 != null) {
                                                                                    x1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.s4.t0(la0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    ka0 ka0Var = la0Var32.S;
                                                                                    if (ka0Var != null) {
                                                                                        ka0Var.c(tLObject);
                                                                                    }
                                                                                    la0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                la0 la0Var4 = la0Var2;
                                                                                la0Var4.U = false;
                                                                                org.telegram.ui.ActionBar.x1 x1Var42 = la0Var4.T;
                                                                                if (x1Var42 != null) {
                                                                                    x1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.s4.t0(la0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        la0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    ka0 ka0Var2 = la0Var4.S;
                                                                                    if (ka0Var2 != null) {
                                                                                        ka0Var2.b(la0Var4.e, tLObject2);
                                                                                    }
                                                                                    la0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i152 = 1;
                                                                final la0 la0Var3 = la0Var;
                                                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.da0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i152) {
                                                                            case 0:
                                                                                la0 la0Var32 = la0Var3;
                                                                                la0Var32.U = false;
                                                                                org.telegram.ui.ActionBar.x1 x1Var32 = la0Var32.T;
                                                                                if (x1Var32 != null) {
                                                                                    x1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.s4.t0(la0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    ka0 ka0Var = la0Var32.S;
                                                                                    if (ka0Var != null) {
                                                                                        ka0Var.c(tLObject);
                                                                                    }
                                                                                    la0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                la0 la0Var4 = la0Var3;
                                                                                la0Var4.U = false;
                                                                                org.telegram.ui.ActionBar.x1 x1Var42 = la0Var4.T;
                                                                                if (x1Var42 != null) {
                                                                                    x1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.s4.t0(la0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        la0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    ka0 ka0Var2 = la0Var4.S;
                                                                                    if (ka0Var2 != null) {
                                                                                        ka0Var2.b(la0Var4.e, tLObject2);
                                                                                    }
                                                                                    la0Var4.finishFragment();
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
                                                la0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            z11 = z10;
                                            if (la0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z11 = true;
                                            }
                                            z12 = la0Var.e.request_needed;
                                            ia0Var = la0Var.f;
                                            if (z12 != (ia0Var == null && ia0Var.e.h)) {
                                            }
                                            obj = la0Var.K.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(la0Var.e.title, obj)) {
                                            }
                                            if (!z13) {
                                            }
                                        }
                                    }
                                }
                                j10 = 0;
                                i11 = la0Var.a;
                                if (i11 != 0) {
                                }
                            }
                        }
                    }
                } else {
                    la0Var.finishFragment();
                    org.telegram.messenger.i0.v1(la0Var.F);
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((ab0) obj2).finishFragment();
                    break;
                }
                break;
            case 4:
                gf0 gf0Var = (gf0) obj2;
                if (i10 != 1) {
                    if (i10 == -1 && gf0Var.onBackPressed(true)) {
                        gf0Var.finishFragment();
                        break;
                    }
                } else {
                    gf0Var.y1();
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
                    ((ig0) obj2).finishFragment();
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
                qh0 qh0Var = (qh0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", qh0Var.b);
                        qh0Var.presentFragment(new s61(bundle));
                        break;
                    }
                } else {
                    qh0Var.finishFragment();
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
                wn0 wn0Var = (wn0) obj2;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            wn0.Z(wn0Var, null);
                            break;
                        }
                    } else if (wn0Var.V != null) {
                        wn0Var.finishFragment(false);
                        wn0Var.V.V();
                        break;
                    }
                } else {
                    wn0Var.finishFragment();
                    break;
                }
                break;
            case 14:
                zn0 zn0Var = (zn0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (zn0Var.c != null && !zn0Var.f) {
                            xn0 xn0Var = zn0Var.d;
                            float f7 = xn0Var.f - xn0Var.y;
                            float f10 = xn0Var.w;
                            float f11 = f7 / f10;
                            float f12 = (xn0Var.h - xn0Var.D) / xn0Var.x;
                            float f13 = xn0Var.d / f10;
                            float f14 = xn0Var.e / f10;
                            zn0 zn0Var2 = xn0Var.H;
                            int width = (int) (f11 * zn0Var2.a.getWidth());
                            int height = (int) (f12 * zn0Var2.a.getHeight());
                            int width2 = (int) (f13 * zn0Var2.a.getWidth());
                            int width3 = (int) (f14 * zn0Var2.a.getWidth());
                            int i16 = width < 0 ? 0 : width;
                            int i17 = height < 0 ? 0 : height;
                            if (i16 + width2 > zn0Var2.a.getWidth()) {
                                width2 = zn0Var2.a.getWidth() - i16;
                            }
                            int i18 = width2;
                            if (i17 + width3 > zn0Var2.a.getHeight()) {
                                width3 = zn0Var2.a.getHeight() - i17;
                            }
                            int i19 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(zn0Var2.a, i16, i17, i18, i19, (Matrix) null, false);
                            } catch (Throwable th2) {
                                org.telegram.messenger.f8.g(th2, true);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(zn0Var2.a, i16, i17, i18, i19, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    org.telegram.messenger.f8.g(th3, true);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == zn0Var.a) {
                                zn0Var.e = true;
                            }
                            ((org.telegram.ui.Components.b40) zn0Var.c).r(false, bitmap, null);
                            zn0Var.f = true;
                        }
                        zn0Var.finishFragment();
                        break;
                    }
                } else {
                    zn0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                jo0 jo0Var = (jo0) obj2;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            io0 io0Var = jo0Var.s0;
                            if (io0Var != null) {
                                io0Var.h0();
                            }
                            jo0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z16 = jo0Var.Y;
                        jo0Var.Y = !z16;
                        if (z16) {
                            jo0Var.K.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(50.0f));
                        } else {
                            jo0Var.K.setPadding(0, 0, 0, org.telegram.messenger.i0.L(48.0f));
                        }
                        jo0Var.K.C0();
                        jo0Var.M.h1(0, 0);
                        jo0Var.L.f();
                        break;
                    }
                } else {
                    jo0Var.finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((mo0) obj2).finishFragment();
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
                qt0 qt0Var = (qt0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        qt0Var.d0();
                        break;
                    }
                } else if (qt0Var.onBackPressed(true)) {
                    qt0Var.finishFragment();
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
                        privacyControlActivity.E0();
                        break;
                    }
                } else if (privacyControlActivity.A0(true)) {
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
                    ((zu0) obj2).finishFragment();
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (i10 == -1) {
                    hx0 hx0Var = profileActivity.N;
                    if (hx0Var == null || !hx0Var.U(true)) {
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
                iz0 iz0Var = (iz0) obj2;
                boolean z17 = iz0Var.I;
                org.telegram.messenger.tz tzVar = iz0Var.J;
                if (i10 != -1) {
                    if (i10 == 1 && iz0Var.getParentActivity() != null) {
                        ji.a a2 = ji.b.a();
                        int i22 = iz0Var.w;
                        if (i22 == 0) {
                            i22 = 1;
                        }
                        a2.a = i22;
                        String obj4 = iz0Var.a[0].getText().toString();
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        a2.c = obj4;
                        a2.b = iz0Var.w == 3 ? 0 : Utilities.z(iz0Var.a[1].getText().toString()).intValue();
                        String obj5 = iz0Var.w == 1 ? iz0Var.a[2].getText().toString() : "";
                        if (obj5 == null) {
                            obj5 = "";
                        }
                        a2.d = obj5;
                        String obj6 = iz0Var.w == 1 ? iz0Var.a[3].getText().toString() : "";
                        if (obj6 == null) {
                            obj6 = "";
                        }
                        a2.e = obj6;
                        String obj7 = iz0Var.w != 1 ? iz0Var.a[4].getText().toString() : "";
                        a2.f = obj7 != null ? obj7 : "";
                        tzVar.a = a2.d();
                        SharedPreferences d12 = org.telegram.messenger.wp.d1();
                        SharedPreferences.Editor edit = d12.edit();
                        if (z17) {
                            org.telegram.messenger.uz.a(tzVar);
                            org.telegram.messenger.uz.B1 = tzVar;
                            edit.putBoolean("proxy_enabled", true);
                        } else {
                            z14 = d12.getBoolean("proxy_enabled", false);
                            org.telegram.messenger.uz.z();
                        }
                        if (z17 || org.telegram.messenger.uz.B1 == tzVar) {
                            tzVar.a.h(edit);
                            ConnectionsManager.setProxySettings(z14, tzVar.a);
                        }
                        edit.commit();
                        org.telegram.messenger.at.e().k(org.telegram.messenger.at.A4, new Object[0]);
                        iz0Var.finishFragment();
                        break;
                    }
                } else {
                    iz0Var.finishFragment();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((oz0) obj2).finishFragment();
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
