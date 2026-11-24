// default package

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wl5 extends c6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wl5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:248:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04b1  */
    @Override // c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        long j;
        boolean z;
        boolean z2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z3;
        boolean z4;
        p56 p56Var;
        String obj;
        boolean z5;
        Bitmap bitmap;
        Runnable runnable;
        byte b = this.a;
        final byte b2 = 0;
        boolean z6 = true;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ((xl5) obj2).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i == -1) {
                    ((es5) obj2).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i == -1) {
                    ((LanguageSelectActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 3:
                final s56 s56Var = (s56) obj2;
                if (i != -1) {
                    if (i == 1) {
                        long j2 = s56Var.b;
                        ArrayList arrayList = s56Var.R;
                        ArrayList arrayList2 = s56Var.P;
                        if (!s56Var.V) {
                            int selectedIndex = s56Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                gm.z3(s56Var.x);
                                Vibrator vibrator = (Vibrator) s56Var.x.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                bjb bjbVar = s56Var.n;
                                if (bjbVar != null && bjbVar.e.h) {
                                    try {
                                        j = Long.parseLong(s56Var.r.d.getText().toString());
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    z = s56Var.a;
                                    if (z) {
                                        he heVar = s56Var.U;
                                        if (heVar != null) {
                                            heVar.dismiss();
                                        }
                                        s56Var.V = true;
                                        he heVar2 = new he(3, null, s56Var.getParentActivity());
                                        s56Var.U = heVar2;
                                        heVar2.q(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = s56Var.getMessagesController().i1(-j2);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = s56Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = s56Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = s56Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        p56 p56Var2 = s56Var.f;
                                        boolean z7 = p56Var2 != null && p56Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z7;
                                        if (z7) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj3 = s56Var.L.getText().toString();
                                        tL_messages_exportChatInvite.title = obj3;
                                        if (!TextUtils.isEmpty(obj3)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = s56Var.getConnectionsManager().isTestBackend() ? nm7.W4 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j;
                                        }
                                        s56Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: j56
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                byte b3 = b2;
                                                final s56 s56Var2 = s56Var;
                                                switch (b3) {
                                                    case 0:
                                                        final byte b4 = 0;
                                                        gm.c3(new Runnable() { // from class: k56
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b5 = b4;
                                                                TLObject tLObject2 = tLObject;
                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                s56 s56Var3 = s56Var2;
                                                                switch (b5) {
                                                                    case 0:
                                                                        s56Var3.V = false;
                                                                        he heVar3 = s56Var3.U;
                                                                        if (heVar3 != null) {
                                                                            heVar3.dismiss();
                                                                        }
                                                                        if (tL_error2 != null) {
                                                                            ik.r0(s56Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            r56 r56Var = s56Var3.T;
                                                                            if (r56Var != null) {
                                                                                r56Var.c(tLObject2);
                                                                            }
                                                                            s56Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        s56Var3.V = false;
                                                                        he heVar4 = s56Var3.U;
                                                                        if (heVar4 != null) {
                                                                            heVar4.dismiss();
                                                                        }
                                                                        if (tL_error2 != null) {
                                                                            ik.r0(s56Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                s56Var3.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            r56 r56Var2 = s56Var3.T;
                                                                            if (r56Var2 != null) {
                                                                                r56Var2.b(s56Var3.e, tLObject2);
                                                                            }
                                                                            s56Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final byte b5 = 1;
                                                        gm.c3(new Runnable() { // from class: k56
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b52 = b5;
                                                                TLObject tLObject2 = tLObject;
                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                s56 s56Var3 = s56Var2;
                                                                switch (b52) {
                                                                    case 0:
                                                                        s56Var3.V = false;
                                                                        he heVar3 = s56Var3.U;
                                                                        if (heVar3 != null) {
                                                                            heVar3.dismiss();
                                                                        }
                                                                        if (tL_error2 != null) {
                                                                            ik.r0(s56Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            r56 r56Var = s56Var3.T;
                                                                            if (r56Var != null) {
                                                                                r56Var.c(tLObject2);
                                                                            }
                                                                            s56Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        s56Var3.V = false;
                                                                        he heVar4 = s56Var3.U;
                                                                        if (heVar4 != null) {
                                                                            heVar4.dismiss();
                                                                        }
                                                                        if (tL_error2 != null) {
                                                                            ik.r0(s56Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                s56Var3.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            r56 r56Var2 = s56Var3.T;
                                                                            if (r56Var2 != null) {
                                                                                r56Var2.b(s56Var3.e, tLObject2);
                                                                            }
                                                                            s56Var3.finishFragment();
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
                                    } else if (z) {
                                        he heVar3 = s56Var.U;
                                        if (heVar3 != null) {
                                            heVar3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = s56Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = s56Var.getMessagesController().i1(-j2);
                                        int selectedIndex4 = s56Var.d.getSelectedIndex();
                                        int size = arrayList2.size();
                                        int i2 = s56Var.W;
                                        if (selectedIndex4 < size) {
                                            if (i2 != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = s56Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z2 = true;
                                            }
                                            z2 = false;
                                        } else {
                                            if (i2 != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z2 = true;
                                            }
                                            z2 = false;
                                        }
                                        int selectedIndex5 = s56Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            tL_chatInviteExported = s56Var.e;
                                            z3 = z2;
                                            if (tL_chatInviteExported.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z3 = true;
                                            }
                                            z4 = tL_chatInviteExported.request_needed;
                                            p56Var = s56Var.f;
                                            if (z4 != (p56Var == null && p56Var.e.h)) {
                                                int i3 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i3 | 8;
                                                boolean z8 = p56Var != null && p56Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z8;
                                                if (z8) {
                                                    tL_messages_editExportedChatInvite.flags = i3 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z3 = true;
                                            }
                                            obj = s56Var.L.getText().toString();
                                            z5 = z3;
                                            if (!TextUtils.equals(s56Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z5 = true;
                                            }
                                            if (!z5) {
                                                s56Var.V = true;
                                                he heVar4 = new he(3, null, s56Var.getParentActivity());
                                                s56Var.U = heVar4;
                                                heVar4.q(500L);
                                                ConnectionsManager connectionsManager = s56Var.getConnectionsManager();
                                                final boolean z9 = z6 ? 1 : 0;
                                                connectionsManager.sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: j56
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        byte b3 = z9;
                                                        final s56 s56Var2 = s56Var;
                                                        switch (b3) {
                                                            case 0:
                                                                final byte b4 = 0;
                                                                gm.c3(new Runnable() { // from class: k56
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        byte b52 = b4;
                                                                        TLObject tLObject2 = tLObject;
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        s56 s56Var3 = s56Var2;
                                                                        switch (b52) {
                                                                            case 0:
                                                                                s56Var3.V = false;
                                                                                he heVar32 = s56Var3.U;
                                                                                if (heVar32 != null) {
                                                                                    heVar32.dismiss();
                                                                                }
                                                                                if (tL_error2 != null) {
                                                                                    ik.r0(s56Var3, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    r56 r56Var = s56Var3.T;
                                                                                    if (r56Var != null) {
                                                                                        r56Var.c(tLObject2);
                                                                                    }
                                                                                    s56Var3.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                s56Var3.V = false;
                                                                                he heVar42 = s56Var3.U;
                                                                                if (heVar42 != null) {
                                                                                    heVar42.dismiss();
                                                                                }
                                                                                if (tL_error2 != null) {
                                                                                    ik.r0(s56Var3, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        s56Var3.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    r56 r56Var2 = s56Var3.T;
                                                                                    if (r56Var2 != null) {
                                                                                        r56Var2.b(s56Var3.e, tLObject2);
                                                                                    }
                                                                                    s56Var3.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final byte b5 = 1;
                                                                gm.c3(new Runnable() { // from class: k56
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        byte b52 = b5;
                                                                        TLObject tLObject2 = tLObject;
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        s56 s56Var3 = s56Var2;
                                                                        switch (b52) {
                                                                            case 0:
                                                                                s56Var3.V = false;
                                                                                he heVar32 = s56Var3.U;
                                                                                if (heVar32 != null) {
                                                                                    heVar32.dismiss();
                                                                                }
                                                                                if (tL_error2 != null) {
                                                                                    ik.r0(s56Var3, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    r56 r56Var = s56Var3.T;
                                                                                    if (r56Var != null) {
                                                                                        r56Var.c(tLObject2);
                                                                                    }
                                                                                    s56Var3.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                s56Var3.V = false;
                                                                                he heVar42 = s56Var3.U;
                                                                                if (heVar42 != null) {
                                                                                    heVar42.dismiss();
                                                                                }
                                                                                if (tL_error2 != null) {
                                                                                    ik.r0(s56Var3, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        s56Var3.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    r56 r56Var2 = s56Var3.T;
                                                                                    if (r56Var2 != null) {
                                                                                        r56Var2.b(s56Var3.e, tLObject2);
                                                                                    }
                                                                                    s56Var3.finishFragment();
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
                                                s56Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            tL_chatInviteExported = s56Var.e;
                                            z3 = z2;
                                            if (tL_chatInviteExported.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z3 = true;
                                            }
                                            z4 = tL_chatInviteExported.request_needed;
                                            p56Var = s56Var.f;
                                            if (z4 != (p56Var == null && p56Var.e.h)) {
                                            }
                                            obj = s56Var.L.getText().toString();
                                            z5 = z3;
                                            if (!TextUtils.equals(s56Var.e.title, obj)) {
                                            }
                                            if (!z5) {
                                            }
                                        }
                                    }
                                }
                                j = 0;
                                z = s56Var.a;
                                if (z) {
                                }
                            }
                        }
                    }
                } else {
                    s56Var.finishFragment();
                    gm.t1(s56Var.G);
                    break;
                }
                break;
            case 4:
                if (i == -1) {
                    ((m86) obj2).finishFragment();
                    break;
                }
                break;
            case 5:
                oc6 oc6Var = (oc6) obj2;
                if (i != -1) {
                    if (i == 1) {
                        oc6Var.b0();
                        break;
                    }
                } else if (oc6Var.onBackPressed(true)) {
                    oc6Var.finishFragment();
                    break;
                }
                break;
            case 6:
                mh6 mh6Var = (mh6) obj2;
                if (i != 1) {
                    if (i == -1 && mh6Var.onBackPressed(true)) {
                        mh6Var.finishFragment();
                        break;
                    }
                } else {
                    mh6Var.D1();
                    break;
                }
                break;
            case 7:
                if (i == -1) {
                    ((ph6) obj2).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i == -1) {
                    ((ak6) obj2).finishFragment();
                    break;
                }
                break;
            case 9:
                cm6 cm6Var = (cm6) obj2;
                if (i != -1) {
                    if (i == 10) {
                        bm6 bm6Var = cm6Var.S;
                        bm6Var.n1(bm6Var.getClosestTab(), false);
                        break;
                    }
                } else if (!cm6Var.S.E(true)) {
                    cm6Var.finishFragment();
                    break;
                }
                break;
            case 10:
                if (i == -1) {
                    ((qv0) obj2).finishFragment();
                    break;
                }
                break;
            case 11:
                t67 t67Var = (t67) obj2;
                if (i != -1) {
                    if (i == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", t67Var.b);
                        t67Var.presentFragment(new xza(bundle));
                        break;
                    }
                } else {
                    t67Var.finishFragment();
                    break;
                }
                break;
            case 12:
                if (i == -1) {
                    ((NotificationsCustomSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i == -1) {
                    ((NotificationsSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 14:
                ss7 ss7Var = (ss7) obj2;
                if (i != -1) {
                    if (i == 1) {
                        ss7Var.i0();
                        break;
                    }
                } else if (ss7Var.onBackPressed(true)) {
                    ss7Var.finishFragment();
                    break;
                }
                break;
            case 15:
                if (i == -1) {
                    ((us7) obj2).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i == -1) {
                    ((PasscodeActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i == -1) {
                    ((PasskeysActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 18:
                j68 j68Var = (j68) obj2;
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            j68Var.Z(null);
                            break;
                        }
                    } else if (j68Var.W != null) {
                        j68Var.finishFragment(false);
                        j68Var.W.t0();
                        break;
                    }
                } else {
                    j68Var.finishFragment();
                    break;
                }
                break;
            case 19:
                t68 t68Var = (t68) obj2;
                if (i != -1) {
                    if (i == 1) {
                        if (t68Var.c != null && !t68Var.f) {
                            s68 s68Var = t68Var.d;
                            float f = s68Var.f - s68Var.y;
                            float f2 = s68Var.w;
                            float f3 = f / f2;
                            float f4 = (s68Var.h - s68Var.E) / s68Var.x;
                            float f5 = s68Var.d / f2;
                            float f6 = s68Var.e / f2;
                            t68 t68Var2 = s68Var.I;
                            int width = (int) (f3 * t68Var2.a.getWidth());
                            int height = (int) (f4 * t68Var2.a.getHeight());
                            int width2 = (int) (f5 * t68Var2.a.getWidth());
                            int width3 = (int) (f6 * t68Var2.a.getWidth());
                            int i4 = width < 0 ? 0 : width;
                            int i5 = height < 0 ? 0 : height;
                            if (i4 + width2 > t68Var2.a.getWidth()) {
                                width2 = t68Var2.a.getWidth() - i4;
                            }
                            int i6 = width2;
                            if (i5 + width3 > t68Var2.a.getHeight()) {
                                width3 = t68Var2.a.getHeight() - i5;
                            }
                            int i7 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(t68Var2.a, i4, i5, i6, i7, (Matrix) null, false);
                            } catch (Throwable th) {
                                fc4.g(th, true);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(t68Var2.a, i4, i5, i6, i7, (Matrix) null, false);
                                } catch (Throwable th2) {
                                    fc4.g(th2, true);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == t68Var.a) {
                                t68Var.e = true;
                            }
                            t68Var.c.r(false, bitmap, null);
                            t68Var.f = true;
                        }
                        t68Var.finishFragment();
                        break;
                    }
                } else {
                    t68Var.finishFragment();
                    break;
                }
                break;
            case 20:
                w78 w78Var = (w78) obj2;
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            u78 u78Var = w78Var.t0;
                            if (u78Var != null) {
                                u78Var.j();
                            }
                            w78Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = w78Var.Z;
                        w78Var.Z = !z10;
                        r59 r59Var = w78Var.L;
                        if (z10) {
                            r59Var.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(50.0f));
                        } else {
                            r59Var.setPadding(0, 0, 0, gm.L(48.0f));
                        }
                        w78Var.L.D0();
                        w78Var.N.g1(0, 0);
                        w78Var.M.f();
                        break;
                    }
                } else {
                    w78Var.finishFragment();
                    break;
                }
                break;
            case 21:
                if (i == -1) {
                    ((d88) obj2).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i == -1 && (runnable = ((wb8) obj2).r) != null) {
                    gm.c3(runnable);
                    break;
                }
                break;
            case 23:
                if (i == -1) {
                    ((ih8) obj2).dismiss();
                    break;
                }
                break;
            case 24:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj2;
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            int i8 = PopupNotificationActivity.c0;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i9 = PopupNotificationActivity.c0;
                        popupNotificationActivity.k();
                        break;
                    }
                } else {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    break;
                }
                break;
            case 25:
                wh8 wh8Var = (wh8) obj2;
                if (i != -1) {
                    if (i == 1) {
                        wh8Var.d0();
                        break;
                    }
                } else if (wh8Var.onBackPressed(true)) {
                    wh8Var.finishFragment();
                    break;
                }
                break;
            case 26:
                if (i == -1) {
                    ((kj8) obj2).dismiss();
                    break;
                }
                break;
            case 27:
                if (i == -1) {
                    ((PremiumPreviewFragment) obj2).finishFragment();
                    break;
                }
                break;
            case 28:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                if (i != -1) {
                    if (i == 1) {
                        privacyControlActivity.J0();
                        break;
                    }
                } else if (privacyControlActivity.z0(true)) {
                    privacyControlActivity.finishFragment();
                    break;
                }
                break;
            default:
                if (i == -1) {
                    ((PrivacySettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
        }
    }
}
