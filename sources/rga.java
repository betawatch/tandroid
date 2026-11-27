// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rga implements u69 {
    public final /* synthetic */ gga a;
    public final /* synthetic */ eja b;

    public rga(eja ejaVar, gga ggaVar) {
        this.b = ejaVar;
        this.a = ggaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0218  */
    @Override // u69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(float f, float f2, int i, View view) {
        boolean z;
        int i2;
        View view2 = view;
        eja ejaVar = this.b;
        rha rhaVar = ejaVar.d0;
        int i3 = 0;
        if (ejaVar.r1) {
            return false;
        }
        gga ggaVar = this.a;
        if (ggaVar.h.getAdapter() == ejaVar.V) {
            return false;
        }
        if (!ejaVar.F1 || ggaVar.F == 11) {
            int i4 = ggaVar.F;
            if (i4 == 7 && (view2 instanceof vac)) {
                if (rhaVar.e.isEmpty()) {
                    i2 = i;
                } else {
                    if (i >= rhaVar.e.size()) {
                        return false;
                    }
                    i2 = ((Integer) rhaVar.e.get(i)).intValue();
                }
                if (i2 < 0 || i2 >= rhaVar.d.participants.participants.size()) {
                    return false;
                }
                TLRPC.ChatParticipant chatParticipant = rhaVar.d.participants.participants.get(i2);
                d79 d79Var = (d79) view2.getParent();
                while (true) {
                    if (i3 >= d79Var.getChildCount()) {
                        break;
                    }
                    View childAt = d79Var.getChildAt(i3);
                    if (RecyclerView.S(childAt) == i) {
                        view2 = childAt;
                        break;
                    }
                    i3++;
                }
                return ejaVar.O0(chatParticipant, true, view2);
            }
            if (i4 == 1 && (view2 instanceof zea)) {
                return ejaVar.N0(((zea) view2).getMessage(), view2, 0, true);
            }
            if (i4 == 3 && (view2 instanceof cfa)) {
                return ejaVar.N0(((cfa) view2).getMessage(), view2, 0, true);
            }
            if ((i4 == 2 || i4 == 4) && (view2 instanceof vea)) {
                return ejaVar.N0(((vea) view2).getMessage(), view2, 0, true);
            }
            if (i4 == 5 && (view2 instanceof vw2)) {
                return ejaVar.N0((r47) ((vw2) view2).getParentObject(), view2, 0, true);
            }
            if ((i4 == 0 || (eja.j0(i4) && ejaVar.p())) && (view2 instanceof jja)) {
                r47 messageObject = ((jja) view2).getMessageObject();
                if (messageObject != null) {
                    return ejaVar.N0(messageObject, view2, ggaVar.F, true);
                }
                return false;
            }
            int i5 = ggaVar.F;
            if (i5 != 10) {
                if (i5 != 11) {
                    return false;
                }
                ejaVar.U.E(view2);
                return true;
            }
            qha qhaVar = ejaVar.T;
            ArrayList arrayList = qhaVar.d;
            eja ejaVar2 = qhaVar.f;
            if (i >= 0 && i < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i);
                Bundle bundle = new Bundle();
                boolean z2 = tLObject instanceof TLRPC.Chat;
                if (z2) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                zu1 zu1Var = new zu1(bundle);
                e eVar = ejaVar2.y1;
                vnb vnbVar = ejaVar2.I1;
                if (eVar instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) eVar;
                    if (profileActivity.U != null) {
                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                        z = true;
                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.scale(0.16666667f, 0.16666667f);
                        profileActivity.fragmentView.draw(canvas);
                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / jn7.J2));
                        profileActivity.U.setBackground(new BitmapDrawable(createBitmap));
                        profileActivity.U.setAlpha(0.0f);
                        profileActivity.U.setVisibility(0);
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, vnbVar, ejaVar2.getContext());
                        yob.h(aob.G8, vnbVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        if (z2) {
                            if (!(tLObject instanceof TLRPC.User)) {
                                return z;
                            }
                            eVar.presentFragmentAsPreview(zu1Var);
                            return z;
                        }
                        b8 b8Var = new b8(ejaVar2.getContext(), false, false);
                        b8Var.j(ob6.M0(2131747538, null), R.drawable.msg_channel, null);
                        b8Var.setMinimumWidth(jn7.p2);
                        b8Var.setOnClickListener(new jn8(qhaVar, (byte) 27));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
                        b8 b8Var2 = new b8(ejaVar2.getContext(), false, false);
                        b8Var2.j(ob6.M0(2131746389, null), R.drawable.msg_addbot, null);
                        b8Var2.setMinimumWidth(jn7.p2);
                        b8Var2.setOnClickListener(new ae((Object) qhaVar, tLObject, i, (byte) 16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var2);
                        eVar.presentFragmentAsPreviewWithMenu(zu1Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        return z;
                    }
                }
                z = true;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, vnbVar, ejaVar2.getContext());
                yob.h(aob.G8, vnbVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                if (z2) {
                }
            }
        } else {
            jga jgaVar = ggaVar.h;
            r69 r69Var = jgaVar.U0;
            if (r69Var != null) {
                r69Var.e(i, view2);
                return true;
            }
            s69 s69Var = jgaVar.V0;
            if (s69Var != null) {
                s69Var.d(0.0f, 0.0f, i, view2);
                return true;
            }
        }
        return true;
    }

    @Override // u69
    public final void f() {
        e eVar = this.b.y1;
        if (eVar != null) {
            Point point = hl.q;
            if (point.x > point.y) {
                eVar.finishPreviewFragment();
            }
        }
    }

    @Override // u69
    public final void h(float f) {
        e eVar = this.b.y1;
        if (eVar != null) {
            Point point = hl.q;
            if (point.x > point.y) {
                eVar.movePreviewFragment(f);
            }
        }
    }
}
