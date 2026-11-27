// default package

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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w0(int i, r47 r47Var) {
        this.a = (byte) 16;
        this.b = i;
        this.c = r47Var;
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
                ((pcc) obj).a(Integer.valueOf(i2));
                break;
            case 1:
                ((m) obj).a(Integer.valueOf(i2));
                break;
            case 2:
                boolean[] zArr = (boolean[]) obj;
                boolean z = !zArr[i2];
                zArr[i2] = z;
                ((sg2) view).c(z, true);
                break;
            case 3:
                ((zu1) obj).m8(i2);
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
                g34 g34Var = (g34) obj;
                if (g34Var.n != null && i2 != g34Var.s) {
                    b8c b8cVar = g34Var.r;
                    if (b8cVar != null) {
                        b8cVar.A = i2;
                    }
                    g34Var.b(i2, true);
                    g34Var.n.a(Integer.valueOf(i2));
                    break;
                }
                break;
            case 7:
                ((o94) obj).c.a(Integer.valueOf(i2));
                break;
            case 8:
                ((h85) obj).l1.x(i2, true);
                break;
            case 9:
                h85 h85Var = (h85) ((gb5) obj).d;
                h85Var.F0(i2);
                h85Var.dismiss();
                break;
            case 10:
                fj6 fj6Var = (fj6) obj;
                if (!fj6Var.c.s()) {
                    hic hicVar = fj6Var.c;
                    if (!hicVar.I) {
                        if (hicVar.getCurrentPosition() == i2) {
                            Object b0 = fj6Var.b0();
                            if (b0 instanceof ej6) {
                                ((ej6) b0).v();
                                break;
                            }
                        } else {
                            fj6Var.t0(i2, true);
                            fj6Var.c.F(i2);
                            break;
                        }
                    }
                }
                break;
            case 11:
                ((em6) obj).S.f1(i2 + 8);
                break;
            case 12:
                nab nabVar = (nab) obj;
                boolean contains = nabVar.e.contains(Integer.valueOf(i2));
                ArrayList arrayList = nabVar.e;
                if (!contains) {
                    arrayList.add(Integer.valueOf(i2));
                } else if (arrayList.size() > 1) {
                    nabVar.e.remove(Integer.valueOf(i2));
                }
                hl.d0(nabVar.b, new ii7(nabVar, r8));
                break;
            case 13:
                yu7 yu7Var = (yu7) obj;
                if (yu7Var.e.getAdapter() instanceof i14) {
                    o24 o24Var = ((i14) yu7Var.e.getAdapter()).c;
                    if ((i2 != 1 && i2 != 2) || !o24Var.x1) {
                        if (i2 == 0 && o24Var.w1) {
                            o24Var.O(true, true, false);
                            break;
                        }
                    } else {
                        o24Var.O(true, false, i2 == 1);
                        break;
                    }
                }
                yu7Var.e.x(i2, false);
                break;
            case 14:
                w78 w78Var = (w78) obj;
                n8 n8Var = w78Var.J;
                if (n8Var != null && n8Var.isShowing()) {
                    w78Var.J.d(true);
                }
                if (i2 == 0) {
                    jj.I(w78Var.getParentActivity(), w78Var.G.a(), new s78(w78Var, b2));
                    break;
                } else {
                    w78Var.Z(w78Var.b, w78Var.c, true, 0);
                    w78Var.finishFragment();
                    break;
                }
                break;
            case 15:
                l98 l98Var = (l98) obj;
                n8 n8Var2 = l98Var.n0;
                if (n8Var2 != null && n8Var2.isShowing()) {
                    l98Var.n0.d(true);
                }
                if (i2 == 0) {
                    jj.I(l98Var.getParentActivity(), l98Var.V.a(), new d98(l98Var, b2));
                    break;
                } else {
                    l98Var.i0(0, true);
                    break;
                }
                break;
            case 16:
                r47 r47Var = (r47) obj;
                int i3 = PopupNotificationActivity.c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    hl.c3(new r77((Object) r7a.B(i2), r47.B0(r47Var.k), r47Var.e1(), (Object) keyboardButtonProto.getData(), (byte) 17));
                    break;
                }
                break;
            case 17:
                ((zn8) obj).b.x(i2, true);
                break;
            case 18:
                gkc gkcVar = (gkc) obj;
                if (gkcVar.V == null && view.getAlpha() != 0.0f) {
                    gkcVar.c(i2, true);
                    break;
                }
                break;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                if (i2 == 0) {
                    gr8 gr8Var = profileActivity.O;
                    if (!gr8Var.F1) {
                        if (eja.t0(gr8Var.getClosestTab())) {
                            gr8 gr8Var2 = profileActivity.O;
                            profileActivity.O.U0(gr8Var2.s1(gr8Var2.getClosestTab()), profileActivity.a(), profileActivity);
                            break;
                        } else if (profileActivity.getMessagesController().k5()) {
                            profileActivity.getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                            rbb C = rbb.C(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            C.y = new fr8(profileActivity);
                            C.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new xk8((e) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (eja.t0(profileActivity.O.getClosestTab())) {
                    long a = profileActivity.a();
                    gr8 gr8Var3 = profileActivity.O;
                    int s1 = gr8Var3.s1(gr8Var3.getClosestTab());
                    String v = profileActivity.getMessagesController().O1().v(s1, a);
                    j61 j61Var = profileActivity.D5;
                    if (j61Var != null) {
                        j61Var.run();
                        profileActivity.D5 = null;
                    }
                    v21.e();
                    ArrayList arrayList2 = new ArrayList();
                    SparseArray<r47> actionModeSelected = profileActivity.O.getActionModeSelected();
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
                        r77 r77Var = new r77((Object) profileActivity, a, s1, (Object) arrayList2, (byte) 16);
                        profileActivity.getMessagesController().O1().e0(s1, a, arrayList2);
                        d31.b0(profileActivity).K(R.raw.chats_archived, hl.S2(ob6.G(arrayList2.size(), "StoryRemovedFromAlbumTitle", v)), ob6.M0(2131743540, null), r77Var).j();
                        break;
                    }
                } else {
                    long e = profileActivity.getUserConfig().e();
                    j61 j61Var2 = profileActivity.D5;
                    if (j61Var2 != null) {
                        j61Var2.run();
                        profileActivity.D5 = null;
                    }
                    v21.e();
                    boolean z3 = profileActivity.O.getClosestTab() == 9;
                    ArrayList arrayList3 = new ArrayList();
                    SparseArray<r47> actionModeSelected2 = profileActivity.O.getActionModeSelected();
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
                        profileActivity.getMessagesController().O1().q0(e, arrayList3, false);
                        boolean[] zArr3 = {false};
                        boolean z4 = z3;
                        profileActivity.D5 = new j61((Object) profileActivity, e, (Object) arrayList3, z3, (byte) 11);
                        da7 da7Var = new da7((Object) profileActivity, (Object) zArr3, (Object) arrayList3, (Object) zArr2, e, (byte) 13);
                        (z4 ? d31.b0(profileActivity).L(R.raw.contact_check, ob6.G(i, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743540, null), da7Var).j() : d31.b0(profileActivity).J(R.raw.chats_archived, ob6.G(i, "StoryArchived", new Object[0]), ob6.M0(2131743540, null), 5000, false, da7Var).j()).w = new hp8(profileActivity, zArr3, (byte) 7);
                        break;
                    }
                }
                break;
            case 20:
                pz8 pz8Var = ((cz8) obj).h;
                u55 u55Var = pz8Var.d;
                ArrayList arrayList4 = pz8Var.n;
                if (i2 >= 0 && i2 < arrayList4.size()) {
                    pz8Var.w = true;
                    pz8Var.h.a(i2, true);
                    int i7 = ((az8) arrayList4.get(i2)).d;
                    int K0 = u55Var.K0();
                    if ((u55Var.m(i7) != null || Math.abs(i7 - K0) <= pz8Var.r * 9) && xea.c()) {
                        uy8 uy8Var = new uy8(pz8Var.getContext());
                        uy8Var.a = ((az8) arrayList4.get(i2)).d;
                        u55Var.v0(uy8Var);
                        break;
                    } else {
                        pz8Var.c.E0();
                        hw6 hw6Var = pz8Var.f;
                        hw6Var.b = K0 < i7 ? (byte) 0 : (byte) 1;
                        hw6Var.k(i7, 0, false, false);
                        break;
                    }
                }
                break;
            case 21:
                xi xiVar = (xi) obj;
                EditTextBoldCursor editTextBoldCursor = xiVar.m1;
                hl.t1(editTextBoldCursor);
                xiVar.n1.a(Integer.valueOf(i2), editTextBoldCursor.getText().toString());
                xiVar.dismiss();
                break;
            case 22:
                ((yg9) obj).Q.Z3(i2);
                break;
            case 23:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i8 = ScrollSlidingTextTabStrip.p0;
                scrollSlidingTextTabStrip.g(view, i2, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 24:
                fra fraVar = ((gra) obj).e2;
                int i9 = fra.w;
                fraVar.a(i2);
                break;
            case 25:
                ((fra) obj).a(i2);
                break;
            case 26:
                w1b w1bVar = (w1b) obj;
                w1bVar.i0.F(i2);
                w1bVar.o0(i2, true);
                break;
            case 27:
                kac kacVar = (kac) obj;
                int i10 = kacVar.b.i.q;
                if (i10 == 2) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    ph0.e().b(false);
                    kacVar.updateAppUpdateViews(i2, true);
                    break;
                } else if (i10 == 3) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    ph0 e2 = ph0.e();
                    if (e2.j) {
                        HttpGetFileTask httpGetFileTask = e2.l;
                        if (httpGetFileTask != null) {
                            httpGetFileTask.cancel(false);
                        }
                        e2.j = false;
                        jn7.e().k(jn7.T4, new Object[0]);
                    }
                    kacVar.updateAppUpdateViews(i2, true);
                    break;
                } else {
                    File g = a.a.g();
                    if (g != null) {
                        hl.s2(g, "Telegram.apk", "application/vnd.android.package-archive", kacVar.d, null, false);
                        break;
                    }
                }
                break;
            default:
                zuc zucVar = (zuc) obj;
                EditText editText = zucVar.a;
                TextView[] textViewArr = zucVar.O;
                TextView textView = textViewArr[i2];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i2].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    zucVar.a();
                    zucVar.a();
                    Runnable runnable = zucVar.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ w0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
