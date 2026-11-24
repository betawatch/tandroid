// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zd1 extends d {
    public yd1 a;
    public yd1 b;
    public r7 c;
    public wjb d;

    public final void Y() {
        String str;
        TLRPC.User f = y6c.h(this.currentAccount).f();
        if (f == null || this.b.getText() == null || this.a.getText() == null) {
            return;
        }
        String obj = this.a.getText().toString();
        String obj2 = this.b.getText().toString();
        String str2 = f.first_name;
        if (str2 == null || !str2.equals(obj) || (str = f.last_name) == null || !str.equals(obj2)) {
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = obj;
            f.first_name = obj;
            updateprofile.last_name = obj2;
            f.last_name = obj2;
            TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(y6c.h(this.currentAccount).e()));
            if (V1 != null) {
                V1.first_name = updateprofile.first_name;
                V1.last_name = updateprofile.last_name;
            }
            y6c.h(this.currentAccount).u(true);
            kk7.f(this.currentAccount).k(kk7.i0, new Object[0]);
            kk7.f(this.currentAccount).k(2, 1);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateprofile, new ce2((byte) 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        wjb wjbVar = this.d;
        zkb.l(this.actionBar, 3, bkb.e8, wjbVar);
        final byte b = 1;
        zkb.l(this.actionBar, 1, bkb.u8, wjbVar);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(k96.M0(2131751252, null));
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 17));
        this.c = this.actionBar.t().h(1, R.drawable.ic_ab_done, gl.L(56.0f), k96.M0(2131751342, null));
        TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(y6c.h(this.currentAccount).e()));
        if (V1 == null) {
            V1 = y6c.h(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new p8((byte) 22));
        final byte b2 = 0;
        yd1 yd1Var = new yd1(this, context, (byte) 0);
        this.a = yd1Var;
        yd1Var.setTextSize(1, 18.0f);
        yd1 yd1Var2 = this.a;
        int i = bkb.G6;
        zkb.D(yd1Var2, i, wjbVar);
        yd1 yd1Var3 = this.a;
        int i2 = bkb.F6;
        zkb.X(yd1Var3, i2, wjbVar);
        this.a.setBackgroundDrawable(null);
        yd1 yd1Var4 = this.a;
        int i3 = bkb.j6;
        int i4 = bkb.k6;
        int i5 = bkb.o7;
        zkb.F(yd1Var4, i3, i4, i5, wjbVar);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setSingleLine(true);
        this.a.setGravity(k96.a0 ? 5 : 3);
        this.a.setInputType(49152);
        this.a.setImeOptions(5);
        this.a.setHint(k96.M0(2131750677, null));
        zkb.v(this.a, i2, wjbVar);
        this.a.setCursorSize(gl.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout.addView(this.a, nme.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: xd1
            public final /* synthetic */ zd1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                byte b3 = b2;
                zd1 zd1Var = this.b;
                switch (b3) {
                    case 0:
                        if (i6 == 5) {
                            zd1Var.b.requestFocus();
                            yd1 yd1Var5 = zd1Var.b;
                            yd1Var5.setSelection(yd1Var5.length());
                            break;
                        }
                        break;
                    default:
                        if (i6 == 6) {
                            zd1Var.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        yd1 yd1Var5 = new yd1(this, context, (byte) 1);
        this.b = yd1Var5;
        yd1Var5.setTextSize(1, 18.0f);
        zkb.D(this.b, i, wjbVar);
        zkb.X(this.b, i2, wjbVar);
        this.b.setBackgroundDrawable(null);
        zkb.F(this.b, i3, i4, i5, wjbVar);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setSingleLine(true);
        this.b.setGravity(k96.a0 ? 5 : 3);
        this.b.setInputType(49152);
        this.b.setImeOptions(6);
        this.b.setHint(k96.M0(2131748840, null));
        zkb.v(this.b, i2, wjbVar);
        this.b.setCursorSize(gl.L(20.0f));
        this.b.setCursorWidth(1.5f);
        linearLayout.addView(this.b, nme.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: xd1
            public final /* synthetic */ zd1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                byte b3 = b;
                zd1 zd1Var = this.b;
                switch (b3) {
                    case 0:
                        if (i6 == 5) {
                            zd1Var.b.requestFocus();
                            yd1 yd1Var52 = zd1Var.b;
                            yd1Var52.setSelection(yd1Var52.length());
                            break;
                        }
                        break;
                    default:
                        if (i6 == 6) {
                            zd1Var.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (V1 != null) {
            this.a.setText(V1.first_name);
            yd1 yd1Var6 = this.a;
            yd1Var6.setSelection(yd1Var6.length());
            this.b.setText(V1.last_name);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final wjb getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        yd1 yd1Var = this.a;
        int i = bkb.j6;
        arrayList.add(new blb(yd1Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        yd1 yd1Var2 = this.a;
        int i2 = bkb.k6;
        arrayList.add(new blb(yd1Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        if (na7.c1().getBoolean("view_animations", true)) {
            return;
        }
        this.a.requestFocus();
        gl.F3(this.a);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            gl.e3(new nv0(this, (byte) 19), 100L);
        }
    }
}
