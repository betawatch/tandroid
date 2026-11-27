// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rn8 extends d6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rn8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // d6
    public final void b(int i) {
        a aVar;
        a aVar2;
        int i2;
        int i3;
        vnb vnbVar;
        int i4;
        byte b = this.a;
        byte b2 = 4;
        d6 d6Var = null;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i == -1) {
                    ((vn8) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i == -1) {
                    ((zn8) obj).a(false, false);
                    break;
                }
                break;
            case 3:
                if (i == -1) {
                    ((gkc) obj).a(false, false);
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i == -1) {
                    gr8 gr8Var = profileActivity.O;
                    if (gr8Var == null || !gr8Var.E(true)) {
                        if (!profileActivity.J0) {
                            profileActivity.finishFragment();
                            break;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", profileActivity.f1);
                            bundle.putLong("user_id", profileActivity.e1);
                            profileActivity.presentFragment(new rz8(bundle));
                            break;
                        }
                    }
                } else {
                    aVar = ((e) profileActivity).actionBar;
                    if (aVar != null) {
                        aVar2 = ((e) profileActivity).actionBar;
                        d6Var = aVar2.getActionBarMenuOnItemClick();
                    }
                    if (d6Var != null) {
                        d6Var.b(i);
                        break;
                    }
                }
                break;
            case 5:
                if (i == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                ox8 ox8Var = (ox8) obj;
                boolean z2 = ox8Var.J;
                wea weaVar = ox8Var.K;
                if (i != -1) {
                    if (i == 1 && ox8Var.getParentActivity() != null) {
                        m66 a = jx8.a();
                        a.o(ox8Var.w);
                        String obj2 = ox8Var.a[0].getText().toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a.c = obj2;
                        a.b = ox8Var.w == 3 ? 0 : Utilities.z(ox8Var.a[1].getText().toString()).intValue();
                        String obj3 = ox8Var.w == 1 ? ox8Var.a[2].getText().toString() : "";
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        a.d = obj3;
                        String obj4 = ox8Var.w == 1 ? ox8Var.a[3].getText().toString() : "";
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        a.e = obj4;
                        String obj5 = ox8Var.w != 1 ? ox8Var.a[4].getText().toString() : "";
                        a.f = obj5 != null ? obj5 : "";
                        weaVar.a = a.c();
                        SharedPreferences e1 = uc7.e1();
                        SharedPreferences.Editor edit = e1.edit();
                        if (z2) {
                            xea.a(weaVar);
                            xea.x1 = weaVar;
                            edit.putBoolean("proxy_enabled", true);
                        } else {
                            z = e1.getBoolean("proxy_enabled", false);
                            xea.y();
                        }
                        if (z2 || xea.x1 == weaVar) {
                            weaVar.a.i(edit);
                            ConnectionsManager.setProxySettings(z, weaVar.a);
                        }
                        edit.commit();
                        jn7.e().k(jn7.D4, new Object[0]);
                        ox8Var.finishFragment();
                        break;
                    }
                } else {
                    ox8Var.finishFragment();
                    break;
                }
                break;
            case 7:
                w09 w09Var = (w09) obj;
                ArrayList arrayList = w09Var.b;
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, w09Var.getResourceProvider(), w09Var.getParentActivity());
                            String G = ob6.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = G;
                            idVar.U = ob6.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                            alertDialog$Builder.j(ob6.M0(2131746048, null), new jz7((Object) this, (byte) 23));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            w09Var.showDialog(idVar);
                            break;
                        }
                    } else if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i2 = ((e) w09Var).currentAccount;
                        a19 c = b19.f(i2).c(intValue);
                        if (c != null) {
                            Activity parentActivity = w09Var.getParentActivity();
                            i3 = ((e) w09Var).currentAccount;
                            vnbVar = ((e) w09Var).resourceProvider;
                            w09.g0(parentActivity, i3, null, c, vnbVar, new jq0(this, intValue, b2));
                            break;
                        }
                    }
                } else if (!arrayList.isEmpty()) {
                    w09Var.d0();
                    break;
                } else {
                    w09Var.finishFragment();
                    break;
                }
                break;
            case 8:
                if (i == -1) {
                    ((n49) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i == -1) {
                    ((nd9) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i == -1) {
                    ((ee9) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i == -1) {
                    ((kp9) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i == -1) {
                    ((SecretMediaViewer) obj).c(true, false);
                    break;
                }
                break;
            case 14:
                if (i == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                tba tbaVar = (tba) obj;
                if (i != -1) {
                    if (i == 2) {
                        tbaVar.j0(new th6(null));
                        break;
                    }
                } else if (!tbaVar.O) {
                    tbaVar.finishFragment();
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", tbaVar.getUserConfig().e());
                    bundle2.putBoolean("immediate", true);
                    tbaVar.presentFragment(new rz8(bundle2));
                    break;
                }
                break;
            case 16:
                ((kea) obj).onBackPressed();
                break;
            case 17:
                if (i == -1) {
                    ((w1b) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i != -1) {
                    stickersActivity.n0(i);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i == -1) {
                    ((bfb) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                xqb xqbVar = (xqb) obj;
                if (i != -1) {
                    if (i == 1) {
                        xqbVar.d0();
                        break;
                    }
                } else {
                    xqbVar.finishFragment();
                    break;
                }
                break;
            case 21:
                if (i == -1) {
                    ((vsb) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i == -1) {
                    ((axb) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i == -1) {
                    ((zzb) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.Y < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.C0();
                        break;
                    }
                }
                break;
            case 25:
                if (i == -1) {
                    ((n9c) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i != -1) {
                    if (i == 1) {
                        userInfoActivity.g0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 27:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i != -1) {
                    if (i == 1) {
                        usersSelectActivity.b0();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            default:
                euc eucVar = (euc) obj;
                if (i != -1) {
                    if (i != 2) {
                        if (i == 3) {
                            eucVar.s0();
                            break;
                        }
                    } else {
                        Activity parentActivity2 = eucVar.getParentActivity();
                        i4 = ((e) eucVar).currentAccount;
                        uqc.L0(i4, eucVar.getResourceProvider(), parentActivity2);
                        break;
                    }
                } else {
                    eucVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
