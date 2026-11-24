// default package

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class x73 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x73(xz7 xz7Var, ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z) {
        this.a = (byte) 1;
        this.c = xz7Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0297  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.SecureValueType secureValueType;
        boolean z;
        int size;
        int i;
        int i2;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 3;
        final boolean z2 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                String str = (String) obj2;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj;
                dataSettingsActivity.getClass();
                if (!TextUtils.equals(gda.e0, str)) {
                    if (z2) {
                        gda.e0 = str;
                        gda.x();
                        gda.a = false;
                        dataSettingsActivity.s0(dataSettingsActivity.n);
                        fn5.z().e(new u73(dataSettingsActivity, b2));
                        alertDialog$Builder.a.M0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        String M0 = jb6.M0(2131751538, null);
                        he heVar = alertDialog$Builder2.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131745573, null);
                        alertDialog$Builder2.j(jb6.M0(2131746478, null), new wu2(dataSettingsActivity, str, alertDialog$Builder, b3));
                        wi8.y(null, 2131753721, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 1:
                final xz7 xz7Var = (xz7) obj3;
                final ArrayList arrayList = (ArrayList) obj2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) obj;
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (0; i2 < size2; i2 + 1) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList.get(i2);
                        i2 = (xz7Var.l1(tL_secureRequiredType, false) == null && size2 != 1) ? i2 + 1 : 0;
                        secureValueType = tL_secureRequiredType2.type;
                        if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList != null && !arrayList.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xz7Var.getParentActivity());
                                alertDialog$Builder3.j(jb6.M0(2131752542, null), null);
                                TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                                z = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                                he heVar2 = alertDialog$Builder3.a;
                                if (!z) {
                                    heVar2.S = jb6.M0(2131747298, null);
                                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                    heVar2.S = jb6.M0(2131747335, null);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                size = arrayList.size();
                                for (i = 0; i < size; i++) {
                                    TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList.get(i)).type;
                                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        arrayList2.add(jb6.M0(2131747348, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                                        arrayList2.add(jb6.M0(2131747347, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        arrayList2.add(jb6.M0(2131747350, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        arrayList2.add(jb6.M0(2131747353, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                        arrayList2.add(jb6.M0(2131747355, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                        arrayList2.add(jb6.M0(2131747357, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                        arrayList2.add(jb6.M0(2131747359, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                        arrayList2.add(jb6.M0(2131747343, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                        arrayList2.add(jb6.M0(2131747345, null));
                                    }
                                }
                                alertDialog$Builder3.e((CharSequence[]) arrayList2.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: vy7
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i3) {
                                        ArrayList arrayList3 = arrayList;
                                        xz7.this.H1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList3.get(i3), arrayList3, z2);
                                    }
                                });
                                xz7Var.showDialog(heVar2);
                                break;
                            }
                        } else {
                            boolean z3 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z3 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && xz7Var.l1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xz7Var.getParentActivity());
                                alertDialog$Builder4.j(jb6.M0(2131747564, null), new ci((Object) xz7Var, (Object) tL_secureRequiredType2, z2, (byte) 11));
                                alertDialog$Builder4.g(jb6.M0(2131752542, null), null);
                                String M02 = jb6.M0(R.string.AppName, null);
                                he heVar3 = alertDialog$Builder4.a;
                                heVar3.S = M02;
                                heVar3.U = jb6.M0(z3 ? 2131747318 : 2131747321, null);
                                xz7Var.showDialog(heVar3);
                                break;
                            }
                        }
                        xz7Var.H1(tL_secureRequiredType2, tL_secureRequiredType, arrayList, z2);
                        break;
                    }
                }
                tL_secureRequiredType = null;
                secureValueType = tL_secureRequiredType2.type;
                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                }
                if (tL_secureRequiredType == null) {
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(xz7Var.getParentActivity());
                    alertDialog$Builder32.j(jb6.M0(2131752542, null), null);
                    TLRPC.SecureValueType secureValueType22 = tL_secureRequiredType2.type;
                    z = secureValueType22 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    he heVar22 = alertDialog$Builder32.a;
                    if (!z) {
                    }
                    ArrayList arrayList22 = new ArrayList();
                    size = arrayList.size();
                    while (i < size) {
                    }
                    alertDialog$Builder32.e((CharSequence[]) arrayList22.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: vy7
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            ArrayList arrayList3 = arrayList;
                            xz7.this.H1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList3.get(i3), arrayList3, z2);
                        }
                    });
                    xz7Var.showDialog(heVar22);
                }
                xz7Var.H1(tL_secureRequiredType2, tL_secureRequiredType, arrayList, z2);
                break;
            case 2:
                ((p) obj3).r0((u31) obj2, z2, (TLRPC.Message[]) obj);
                break;
            case 3:
                ((p) obj3).t0((u31) obj2, z2, (TLRPC.Message) obj);
                break;
            case 4:
                v48 v48Var = (v48) obj3;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(storyItem);
                a58 a58Var = v48Var.x;
                h4b N1 = oc7.r1(a58Var.s2).N1();
                long j = a58Var.r1;
                boolean z4 = this.b;
                N1.r0(j, arrayList3, z4, new sw1(v48Var, storyItem, z4, (r63) obj));
                v48 v48Var2 = a58Var.j1;
                if (v48Var2 != null) {
                    v48Var2.a();
                    break;
                }
                break;
            case 5:
                kj8 kj8Var = (kj8) obj3;
                d dVar = (d) obj2;
                hk8 hk8Var = (hk8) obj;
                if (dVar instanceof yv1) {
                    yv1 yv1Var = (yv1) dVar;
                    yv1Var.N5(true);
                    e51 e51Var = yv1Var.Y1;
                    if (e51Var != null) {
                        e51Var.a(true);
                    }
                }
                d Q = LaunchActivity.Q();
                int i3 = 0;
                while (i3 < 2) {
                    d dVar2 = i3 == 0 ? dVar : Q;
                    if (dVar2 != null && dVar2.getLastStoryViewer() != null) {
                        oab lastStoryViewer = dVar2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.v0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        ah0 ah0Var = lastStoryViewer.w0;
                        if (ah0Var != null) {
                            ah0Var.dismiss();
                        }
                        a58 w = lastStoryViewer.w();
                        if (w != null) {
                            v29 v29Var = w.V1;
                            if (v29Var != null && v29Var.getReactionsWindow() != null) {
                                w.V1.getReactionsWindow().d();
                            }
                            z38 z38Var = w.P2;
                            if (z38Var != null) {
                                z38Var.dismiss();
                            }
                            w.G0();
                        }
                    }
                    if (dVar2 != null && dVar2.getVisibleDialog() != null) {
                        dVar2.getVisibleDialog().dismiss();
                    }
                    i3++;
                }
                if (z2 || kj8Var.z1) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.p0(hk8Var.a));
                    if (dVar instanceof rob) {
                        bh0 bh0Var = new bh0();
                        bh0Var.a = true;
                        dVar.showAsSheet(premiumPreviewFragment, bh0Var);
                    } else if (dVar != null) {
                        dVar.presentFragment(premiumPreviewFragment);
                    } else {
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.o0(dVar, kj8Var.D1, PremiumPreviewFragment.p0(hk8Var.a), null);
                }
                kj8Var.dismiss();
                break;
            default:
                h0b h0bVar = (h0b) obj3;
                ylb ylbVar = (ylb) obj;
                if (((TLRPC.User) obj2).premium) {
                    if (h0bVar.m1) {
                        h0bVar.dismiss();
                        zi3 zi3Var = h0bVar.o1;
                        if (zi3Var != null) {
                            zi3Var.a(false);
                            break;
                        }
                    } else {
                        h4b N12 = oc7.r1(h0bVar.a).N1();
                        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = N12.B;
                        if (tL_storiesStealthMode == null || ConnectionsManager.getInstance(h0bVar.a).getCurrentTime() > tL_storiesStealthMode.cooldown_until_date) {
                            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                            tL_stories_activateStealthMode.future = true;
                            tL_stories_activateStealthMode.past = true;
                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                            tL_storiesStealthMode2.flags |= 3;
                            int currentTime = ConnectionsManager.getInstance(h0bVar.a).getCurrentTime();
                            gt2 gt2Var = oc7.r1(h0bVar.a).l4.e3;
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            tL_storiesStealthMode2.cooldown_until_date = currentTime + ((int) gt2Var.g(timeUnit));
                            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(h0bVar.a).getCurrentTime() + ((int) oc7.r1(h0bVar.a).l4.d3.g(timeUnit));
                            N12.h0(tL_storiesStealthMode2);
                            ConnectionsManager.getInstance(h0bVar.a).sendRequest(tL_stories_activateStealthMode, new nf2((byte) 8));
                            try {
                                h0bVar.b.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            h0bVar.dismiss();
                            if (!z2) {
                                h0b.D0();
                            }
                            zi3 zi3Var2 = h0bVar.o1;
                            if (zi3Var2 != null) {
                                zi3Var2.a(true);
                                break;
                            }
                        } else if (h0bVar.m1) {
                            h0bVar.dismiss();
                            zi3 zi3Var3 = h0bVar.o1;
                            if (zi3Var3 != null) {
                                zi3Var3.a(false);
                                break;
                            }
                        } else {
                            new c41(h0bVar.c, ylbVar).t(gm.S2(jb6.M0(2131744573, null)), null).k(true);
                            break;
                        }
                    }
                } else {
                    h0bVar.dismiss();
                    d Q2 = LaunchActivity.Q();
                    if (Q2 != null) {
                        Q2.showDialog(new kj8(Q2, 14, false));
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ x73(h0b h0bVar, TLRPC.User user, int i, ylb ylbVar) {
        this.a = (byte) 6;
        this.c = h0bVar;
        this.d = user;
        this.b = i;
        this.e = ylbVar;
    }

    public /* synthetic */ x73(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
