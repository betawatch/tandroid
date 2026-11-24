// default package

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v0(int i, k47 k47Var) {
        this.a = (byte) 15;
        this.b = i;
        this.c = k47Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        byte b = this.a;
        byte b2 = 2;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((qac) obj).a(Integer.valueOf(i2));
                break;
            case 1:
                ((m) obj).a(Integer.valueOf(i2));
                break;
            case 2:
                boolean[] zArr = (boolean[]) obj;
                boolean z = !zArr[i2];
                zArr[i2] = z;
                ((oh2) view).c(z, true);
                break;
            case 3:
                ((yv1) obj).l8(i2);
                break;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z2 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.b.U2.getActionBarMenuOnItemClick().b(i2);
                chatAttachAlertPhotoLayout.x.U(null, null);
                break;
            case 5:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i2);
                break;
            case 6:
                w34 w34Var = (w34) obj;
                if (w34Var.n != null && i2 != w34Var.s) {
                    c6c c6cVar = w34Var.r;
                    if (c6cVar != null) {
                        c6cVar.A = i2;
                    }
                    w34Var.b(i2, true);
                    w34Var.n.a(Integer.valueOf(i2));
                    break;
                }
                break;
            case 7:
                ((d85) obj).l1.x(i2, true);
                break;
            case 8:
                d85 d85Var = (d85) ((db5) obj).d;
                d85Var.E0(i2);
                d85Var.dismiss();
                break;
            case 9:
                bj6 bj6Var = (bj6) obj;
                ValueAnimator valueAnimator = bj6Var.c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    igc igcVar = bj6Var.c;
                    if (!igcVar.I) {
                        if (igcVar.getCurrentPosition() == i2) {
                            Object b0 = bj6Var.b0();
                            if (b0 instanceof aj6) {
                                ((aj6) b0).u();
                                break;
                            }
                        } else {
                            bj6Var.o0(i2, true);
                            bj6Var.c.E(i2);
                            break;
                        }
                    }
                }
                break;
            case 10:
                ((cm6) obj).S.f1(i2 + 8);
                break;
            case 11:
                r8b r8bVar = (r8b) obj;
                boolean contains = r8bVar.e.contains(Integer.valueOf(i2));
                ArrayList arrayList = r8bVar.e;
                if (!contains) {
                    arrayList.add(Integer.valueOf(i2));
                } else if (arrayList.size() > 1) {
                    r8bVar.e.remove(Integer.valueOf(i2));
                }
                gm.d0(r8bVar.b, new ci7(r8bVar, r8));
                break;
            case 12:
                tt7 tt7Var = (tt7) obj;
                if (tt7Var.e.getAdapter() instanceof y14) {
                    e34 e34Var = ((y14) tt7Var.e.getAdapter()).c;
                    if ((i2 != 1 && i2 != 2) || !e34Var.x1) {
                        if (i2 == 0 && e34Var.w1) {
                            e34Var.O(true, true, false);
                            break;
                        }
                    } else {
                        e34Var.O(true, false, i2 == 1);
                        break;
                    }
                }
                tt7Var.e.x(i2, false);
                break;
            case 13:
                j68 j68Var = (j68) obj;
                m8 m8Var = j68Var.J;
                if (m8Var != null && m8Var.isShowing()) {
                    j68Var.J.d(true);
                }
                if (i2 == 0) {
                    ik.I(j68Var.getParentActivity(), j68Var.G.a(), new e68(j68Var, b2));
                    break;
                } else {
                    j68Var.a0(j68Var.b, j68Var.c, true, 0);
                    j68Var.finishFragment();
                    break;
                }
                break;
            case 14:
                w78 w78Var = (w78) obj;
                m8 m8Var2 = w78Var.n0;
                if (m8Var2 != null && m8Var2.isShowing()) {
                    w78Var.n0.d(true);
                }
                if (i2 == 0) {
                    ik.I(w78Var.getParentActivity(), w78Var.V.a(), new o78(w78Var, b2));
                    break;
                } else {
                    w78Var.j0(0, true);
                    break;
                }
                break;
            case 15:
                k47 k47Var = (k47) obj;
                int i3 = PopupNotificationActivity.c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    gm.c3(new o77((Object) a6a.B(i2), k47.B0(k47Var.k), k47Var.e1(), (Object) keyboardButtonProto.getData(), (byte) 17));
                    break;
                }
                break;
            case 16:
                ((om8) obj).b.x(i2, true);
                break;
            case 17:
                cic cicVar = (cic) obj;
                if (cicVar.V == null && view.getAlpha() != 0.0f) {
                    cicVar.c(i2, true);
                    break;
                }
                break;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.e7;
                if (i2 == 0) {
                    wp8 wp8Var = profileActivity.O;
                    if (!wp8Var.F1) {
                        if (nha.t0(wp8Var.getClosestTab())) {
                            wp8 wp8Var2 = profileActivity.O;
                            profileActivity.O.U0(wp8Var2.s1(wp8Var2.getClosestTab()), profileActivity.a(), profileActivity);
                            break;
                        } else if (profileActivity.getMessagesController().e5()) {
                            profileActivity.getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                            v9b C = v9b.C(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            C.y = new vp8(profileActivity);
                            C.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new kj8((d) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (nha.t0(profileActivity.O.getClosestTab())) {
                    long a = profileActivity.a();
                    wp8 wp8Var3 = profileActivity.O;
                    int s1 = wp8Var3.s1(wp8Var3.getClosestTab());
                    String v = profileActivity.getMessagesController().N1().v(s1, a);
                    i71 i71Var = profileActivity.I5;
                    if (i71Var != null) {
                        i71Var.run();
                        profileActivity.I5 = null;
                    }
                    u31.e();
                    ArrayList arrayList2 = new ArrayList();
                    SparseArray<k47> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i4 = 0; i4 < actionModeSelected.size(); i4++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i4).l;
                            if (storyItem != null) {
                                arrayList2.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.E(false);
                    if (!arrayList2.isEmpty()) {
                        o77 o77Var = new o77((Object) profileActivity, a, s1, (Object) arrayList2, (byte) 16);
                        profileActivity.getMessagesController().N1().e0(s1, a, arrayList2);
                        c41.b0(profileActivity).K(R.raw.chats_archived, gm.S2(jb6.G(arrayList2.size(), "StoryRemovedFromAlbumTitle", v)), jb6.M0(2131743572, null), o77Var).j();
                        break;
                    }
                } else {
                    long e = profileActivity.getUserConfig().e();
                    i71 i71Var2 = profileActivity.I5;
                    if (i71Var2 != null) {
                        i71Var2.run();
                        profileActivity.I5 = null;
                    }
                    u31.e();
                    boolean z3 = profileActivity.O.getClosestTab() == 9;
                    ArrayList arrayList3 = new ArrayList();
                    SparseArray<k47> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        i = 0;
                        for (int i5 = 0; i5 < actionModeSelected2.size(); i5++) {
                            TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i5).l;
                            if (storyItem2 != null) {
                                arrayList3.add(storyItem2);
                                i++;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    profileActivity.O.E(false);
                    if (z3) {
                        profileActivity.O.f1(8);
                    }
                    if (!arrayList3.isEmpty()) {
                        boolean[] zArr2 = new boolean[arrayList3.size()];
                        for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                            TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList3.get(i6);
                            zArr2[i6] = storyItem3.pinned;
                            storyItem3.pinned = z3;
                        }
                        profileActivity.getMessagesController().N1().q0(e, arrayList3, false);
                        boolean[] zArr3 = {false};
                        boolean z4 = z3;
                        profileActivity.I5 = new i71((Object) profileActivity, e, (Object) arrayList3, z3, (byte) 9);
                        r97 r97Var = new r97((Object) profileActivity, (Object) zArr3, (Object) arrayList3, (Object) zArr2, e, (byte) 12);
                        (z4 ? c41.b0(profileActivity).L(R.raw.contact_check, jb6.G(i, "StorySavedTitle", new Object[0]), jb6.M0(2131744170, null), jb6.M0(2131743572, null), r97Var).j() : c41.b0(profileActivity).J(R.raw.chats_archived, jb6.G(i, "StoryArchived", new Object[0]), jb6.M0(2131743572, null), 5000, false, r97Var).j()).w = new mn8(profileActivity, zArr3, (byte) 11);
                        break;
                    }
                }
                break;
            case 19:
                gy8 gy8Var = ((sx8) obj).h;
                q55 q55Var = gy8Var.d;
                ArrayList arrayList4 = gy8Var.n;
                if (i2 >= 0 && i2 < arrayList4.size()) {
                    gy8Var.w = true;
                    gy8Var.h.a(i2, true);
                    int i7 = ((qx8) arrayList4.get(i2)).d;
                    int K0 = q55Var.K0();
                    if ((q55Var.m(i7) != null || Math.abs(i7 - K0) <= gy8Var.r * 9) && gda.c()) {
                        kx8 kx8Var = new kx8(gy8Var.getContext());
                        kx8Var.a = ((qx8) arrayList4.get(i2)).d;
                        q55Var.v0(kx8Var);
                        break;
                    } else {
                        gy8Var.c.D0();
                        cw6 cw6Var = gy8Var.f;
                        cw6Var.b = K0 < i7 ? (byte) 0 : (byte) 1;
                        cw6Var.l(i7, 0, false, false);
                        break;
                    }
                }
                break;
            case 20:
                wj wjVar = (wj) obj;
                EditTextBoldCursor editTextBoldCursor = wjVar.m1;
                gm.t1(editTextBoldCursor);
                wjVar.n1.a(Integer.valueOf(i2), editTextBoldCursor.getText().toString());
                wjVar.dismiss();
                break;
            case 21:
                ((jf9) obj).Q.Y3(i2);
                break;
            case 22:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i8 = ScrollSlidingTextTabStrip.p0;
                scrollSlidingTextTabStrip.g(view, i2, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 23:
                jpa jpaVar = ((kpa) obj).e2;
                int i9 = jpa.w;
                jpaVar.a(i2);
                break;
            case 24:
                ((jpa) obj).a(i2);
                break;
            case 25:
                xza xzaVar = (xza) obj;
                xzaVar.i0.E(i2);
                xzaVar.p0(i2, true);
                break;
            case 26:
                l8c l8cVar = (l8c) obj;
                int i10 = l8cVar.b.i.q;
                if (i10 == 2) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    oi0.e().b(false);
                    l8cVar.updateAppUpdateViews(i2, true);
                    break;
                } else if (i10 == 3) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    oi0 e2 = oi0.e();
                    if (e2.j) {
                        HttpGetFileTask httpGetFileTask = e2.l;
                        if (httpGetFileTask != null) {
                            httpGetFileTask.cancel(false);
                        }
                        e2.j = false;
                        nm7.e().k(nm7.U4, new Object[0]);
                    }
                    l8cVar.updateAppUpdateViews(i2, true);
                    break;
                } else {
                    File g = a.a.g();
                    if (g != null) {
                        gm.s2(g, "Telegram.apk", "application/vnd.android.package-archive", l8cVar.d, null, false);
                        break;
                    }
                }
                break;
            default:
                nsc nscVar = (nsc) obj;
                EditText editText = nscVar.a;
                TextView[] textViewArr = nscVar.O;
                TextView textView = textViewArr[i2];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i2].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    nscVar.a();
                    nscVar.a();
                    Runnable runnable = nscVar.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ v0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
