package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zz0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xz0 xz0Var = (xz0) ((jg.b1) this.b).e;
                if (xz0Var != null) {
                    xz0Var.run();
                    break;
                }
                break;
            case 1:
                ((g01) this.b).dismiss();
                break;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.a);
                    org.telegram.messenger.cw cwVar = saveToGallerySettingsActivity.c;
                    m10.put(cwVar.d, cwVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 3:
                ((org.telegram.ui.Components.e30) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                org.telegram.messenger.kj kjVar = secretMediaViewer.f0;
                if (kjVar != null) {
                    TLRPC.Message message = kjVar.k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        vh.p2 p2Var = secretMediaViewer.r;
                        if (p2Var.V) {
                            p2Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.m();
                            break;
                        }
                    }
                }
                break;
            case 5:
                q31 q31Var = (q31) this.b;
                if (q31Var.S1 instanceof TLRPC.User) {
                    vh.d dVar = q31Var.Z1;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        q31Var.e1((TLRPC.User) q31Var.S1, null, null);
                        break;
                    }
                }
                break;
            case 6:
                SessionsActivity sessionsActivity = ((o41) this.b).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        u9.j0(sessionsActivity.getParentActivity(), 2, new m41(sessionsActivity));
                        break;
                    }
                }
                break;
            case 7:
                w71 w71Var = (w71) this.b;
                org.telegram.messenger.uz.H0 = !org.telegram.messenger.uz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.uz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.t6.k(false, false);
                w71Var.c.setChecked(org.telegram.messenger.uz.H0);
                org.telegram.ui.Cells.z9 z9Var = w71Var.a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().Q1 = false;
                    q1Var.E1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.at.e().k(org.telegram.messenger.at.z4, new Object[0]);
                break;
            case 8:
                ((v91) this.b).c(true);
                break;
            case 9:
                ((v91) ((mg.s) this.b).c).c(true);
                break;
            case 10:
                ca1 ca1Var = (ca1) this.b;
                ArrayList arrayList = ca1Var.f;
                HashSet hashSet = ca1Var.x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User Z1 = ca1Var.getMessagesController().Z1(Long.valueOf(ca1Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ca1Var.getMessagesController().N3(chat, false);
                        ca1Var.getMessagesController().f0(chat.id, Z1);
                    }
                    ca1Var.finishFragment();
                    break;
                }
                break;
            default:
                re1 re1Var = (re1) this.b;
                re1Var.a.c(!r0.b(), true);
                re1Var.c.setEnabled(re1Var.a.b());
                re1Var.c.animate().alpha(re1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
