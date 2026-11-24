// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rkc extends FrameLayout {
    public final lhc a;
    public qkc b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public rkc(Activity activity, lhc lhcVar) {
        super(activity);
        this.a = lhcVar;
        setWillNotDraw(true);
        qkc qkcVar = new qkc(activity, lhcVar);
        this.b = qkcVar;
        addView(qkcVar, qoe.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, qoe.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, qoe.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i) {
        this.b.a = new p09(R.raw.bt_to_speaker, i, i, true, null);
        this.b.b = new p09(R.raw.bt_to_speaker, i, i, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i, int i2, int i3, boolean z) {
        qkc qkcVar = new qkc(getContext(), this.a);
        if (i == R.raw.camera_flip2) {
            p09 p09Var = new p09(i, i2, i2, true, null);
            qkcVar.c = p09Var;
            p09Var.M(qkcVar);
        } else {
            qkcVar.a = new p09(i, i2, i2, true, null);
            p09 p09Var2 = new p09(i, i2, i2, true, null);
            qkcVar.b = p09Var2;
            p09Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        qkcVar.a(i3, z, false);
        qkcVar.setAlpha(0.0f);
        qkcVar.setOnBtnClickedListener(this.b.y);
        addView(qkcVar, qoe.a(53.5f, 53.5f, 1));
        qkc qkcVar2 = this.b;
        this.b = qkcVar;
        qkcVar.animate().alpha(1.0f).setDuration(250L).start();
        qkcVar2.animate().alpha(0.0f).setDuration(250L).setListener(new ic8((Object) this, (Object) qkcVar2, (byte) 24)).start();
    }

    public final void c(int i) {
        this.b.a = new p09(R.raw.speaker_to_bt, i, i, true, null);
        this.b.b = new p09(R.raw.speaker_to_bt, i, i, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, boolean z, boolean z2) {
        boolean z3;
        String M0;
        TextView textView;
        int visibility;
        TextView textView2;
        if (this.c == i && z == this.b.w) {
            if (getVisibility() != 0) {
                setVisibility(0);
                return;
            }
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        int L = gm.L(53.5f);
        int F = wi8.F(i);
        if (F != 0) {
            if (F == 1) {
                int i2 = this.c;
                if (i2 == 5 || i2 == 4) {
                    b(R.raw.camera_flip2, L, i, z);
                    z3 = true;
                } else if (i2 != 2) {
                    this.b.c = new p09(R.raw.camera_flip2, L, L, true, null);
                    qkc qkcVar = this.b;
                    qkcVar.c.M(qkcVar);
                }
            } else if (F != 2) {
                if (F == 3) {
                    int i3 = this.c;
                    if (i3 == 5) {
                        qkc qkcVar2 = this.b;
                        z3 = z == qkcVar2.w;
                        p09 p09Var = z ? qkcVar2.b : qkcVar2.a;
                        p09Var.M(qkcVar2);
                        p09Var.u0 = new mkc(this, L, (byte) 1);
                        p09Var.start();
                    } else if (i3 == 2) {
                        b(R.raw.bt_to_speaker, L, i, z);
                        z3 = true;
                    } else if (i3 != 4) {
                        a(L);
                    }
                } else if (F == 4) {
                    int i4 = this.c;
                    if (i4 == 4) {
                        qkc qkcVar3 = this.b;
                        z3 = z == qkcVar3.w;
                        p09 p09Var2 = z ? qkcVar3.b : qkcVar3.a;
                        p09Var2.M(qkcVar3);
                        p09Var2.u0 = new mkc(this, L, (byte) 0);
                        p09Var2.start();
                    } else if (i4 == 2) {
                        b(R.raw.speaker_to_bt, L, i, z);
                        z3 = true;
                    } else if (i4 != 5) {
                        c(L);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new p09(R.raw.video_stop, L, L, true, null);
                this.b.b = new p09(R.raw.video_stop, L, L, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                qkc qkcVar4 = this.b;
                qkcVar4.b.M(qkcVar4);
            }
            if (!z3) {
                this.b.a(i, z, (this.c == 0 || z2) ? false : true);
            }
            int F2 = wi8.F(i);
            M0 = F2 == 0 ? F2 != 1 ? F2 != 2 ? F2 != 3 ? F2 != 4 ? "" : jb6.M0(2131742923, null) : jb6.M0(2131743187, null) : z ? jb6.M0(2131742922, null) : jb6.M0(2131742921, null) : jb6.M0(2131743090, null) : z ? jb6.M0(2131742914, null) : jb6.M0(2131742977, null);
            setContentDescription(M0);
            textView = this.d;
            visibility = textView.getVisibility();
            textView2 = this.e;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(M0);
                textView2.setText(M0);
            } else if (textView2.getText().equals(M0) || !textView.getText().equals(M0)) {
                textView.animate().alpha(0.0f).translationY(-gm.L(4.0f)).setDuration(140L).setListener(new ic8(this, M0, (byte) 23)).start();
                textView2.setText(M0);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(gm.L(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new q7b(this, (byte) 26)).start();
            }
            this.c = i;
        }
        if (this.c != 1) {
            this.b.a = new p09(R.raw.call_mute, L, L, true, null);
            this.b.b = new p09(R.raw.call_mute, L, L, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            qkc qkcVar5 = this.b;
            qkcVar5.b.M(qkcVar5);
        }
        z3 = false;
        if (!z3) {
        }
        int F22 = wi8.F(i);
        if (F22 == 0) {
        }
        setContentDescription(M0);
        textView = this.d;
        visibility = textView.getVisibility();
        textView2 = this.e;
        if (visibility != 8) {
        }
        if (textView2.getText().equals(M0)) {
        }
        textView.animate().alpha(0.0f).translationY(-gm.L(4.0f)).setDuration(140L).setListener(new ic8(this, M0, (byte) 23)).start();
        textView2.setText(M0);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(gm.L(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new q7b(this, (byte) 26)).start();
        this.c = i;
    }

    public void setOnBtnClickedListener(pkc pkcVar) {
        this.b.setOnBtnClickedListener(pkcVar);
    }
}
