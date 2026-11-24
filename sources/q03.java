// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q03 extends fy0 {
    public final FrameLayout S1;
    public final u41 T1;
    public final u41 U1;
    public final ArrayList V1;
    public final HashSet W1;
    public boolean X1;
    public l5c Y1;

    public q03(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new f53());
        ArrayList arrayList = new ArrayList();
        this.V1 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.W1 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        M(bkb.g5);
        final byte b = 0;
        this.s = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.S1 = frameLayout;
        final byte b2 = 1;
        LinearLayout m = ir2.m(activity, 1);
        frameLayout.addView(m, nme.e(-1, -1, kk7.D1));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, nme.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        ote.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: p03
            public final /* synthetic */ q03 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                q03 q03Var = this.b;
                switch (b3) {
                    case 0:
                        q03Var.dismiss();
                        break;
                    case 1:
                        q03Var.Y0(false);
                        break;
                    default:
                        q03Var.Y0(true);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = gl.L(80.0f);
        int i = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.v0(i, this.J0));
        vkb M = zkb.M(i);
        wjb wjbVar = this.J0;
        frameLayout2.setBackground(K);
        zkb.j(frameLayout2, K, M, null, wjbVar);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, nme.e(56, 56, 17));
        m.addView(frameLayout2, nme.t(80, 80, 1, 2, 21, 2, 13));
        int i2 = bkb.F6;
        l46 a = hve.a(activity, 20.0f, i2, true, this.J0);
        a.setText(k96.M0(2131749291, null));
        a.setGravity(17);
        m.addView(a, nme.t(-1, -2, 1, 2, 0, 2, 4));
        l46 a2 = hve.a(activity, 14.0f, i2, false, this.J0);
        a2.setText(gl.T2(k96.M0(2131749292, null)));
        a2.setGravity(17);
        a2.setMaxWidth(je5.a(a2.getText(), a2.getPaint()));
        m.addView(a2, nme.t(-1, -2, 1, 2, 0, 2, 23));
        l5c l5cVar = this.Y1;
        if (l5cVar != null) {
            l5cVar.O(false);
        }
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        this.n1.setOnItemClickListener(new vu2(this, (byte) 4));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout m2 = ir2.m(activity, 0);
        m2.setPadding(gl.L(14.0f) + this.u0, gl.L(14.0f), gl.L(14.0f) + this.u0, gl.L(14.0f));
        frameLayout3.addView(m2, nme.e(-1, -2, 87));
        u41 u41Var = new u41(this.J0, activity, true);
        this.T1 = u41Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new cm2(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) k96.M0(2131749289, null));
        u41Var.i(spannableStringBuilder, false, true);
        m2.addView(u41Var, nme.q(-1, 48, 1.0f, kk7.D1, 0, 0, 6, 0));
        u41Var.setOnClickListener(new View.OnClickListener(this) { // from class: p03
            public final /* synthetic */ q03 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                q03 q03Var = this.b;
                switch (b3) {
                    case 0:
                        q03Var.dismiss();
                        break;
                    case 1:
                        q03Var.Y0(false);
                        break;
                    default:
                        q03Var.Y0(true);
                        break;
                }
            }
        });
        u41 u41Var2 = new u41(this.J0, activity, true);
        this.U1 = u41Var2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new cm2(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) k96.M0(2131749290, null));
        u41Var2.i(spannableStringBuilder2, false, true);
        m2.addView(u41Var2, nme.q(-1, 48, 1.0f, kk7.D1, 6, 0, 0, 0));
        final byte b3 = 2;
        u41Var2.setOnClickListener(new View.OnClickListener(this) { // from class: p03
            public final /* synthetic */ q03 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                q03 q03Var = this.b;
                switch (b32) {
                    case 0:
                        q03Var.dismiss();
                        break;
                    case 1:
                        q03Var.Y0(false);
                        break;
                    default:
                        q03Var.Y0(true);
                        break;
                }
            }
        });
        this.b.addView(frameLayout3, nme.e(-1, -2, 87));
        o39 o39Var = this.n1;
        int i3 = this.u0;
        o39Var.setPadding(i3, 0, i3, gl.L(76.0f));
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, true, new w72(this, (byte) 14), this.J0);
        this.Y1 = l5cVar;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        return k96.M0(2131749291, null);
    }

    public final void Y0(boolean z) {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        u41 u41Var = z ? this.U1 : this.T1;
        u41Var.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.W1);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.b.nextInt();
        ConnectionsManager.getInstance(this.a).sendRequest(createconferencecall, new ji1((Object) this, (Object) u41Var, z, (Object) hashSet, (byte) 3));
    }
}
