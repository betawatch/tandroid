// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ric extends FrameLayout {
    public final lfc a;
    public qic b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public ric(Activity activity, lfc lfcVar) {
        super(activity);
        this.a = lfcVar;
        setWillNotDraw(true);
        qic qicVar = new qic(activity, lfcVar);
        this.b = qicVar;
        addView(qicVar, nme.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, nme.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, nme.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i) {
        this.b.a = new oy8(R.raw.bt_to_speaker, i, i, true, null);
        this.b.b = new oy8(R.raw.bt_to_speaker, i, i, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i, int i2, int i3, boolean z) {
        qic qicVar = new qic(getContext(), this.a);
        if (i == R.raw.camera_flip2) {
            oy8 oy8Var = new oy8(i, i2, i2, true, null);
            qicVar.c = oy8Var;
            oy8Var.M(qicVar);
        } else {
            qicVar.a = new oy8(i, i2, i2, true, null);
            oy8 oy8Var2 = new oy8(i, i2, i2, true, null);
            qicVar.b = oy8Var2;
            oy8Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        qicVar.a(i3, z, false);
        qicVar.setAlpha(0.0f);
        qicVar.setOnBtnClickedListener(this.b.y);
        addView(qicVar, nme.a(53.5f, 53.5f, 1));
        qic qicVar2 = this.b;
        this.b = qicVar;
        qicVar.animate().alpha(1.0f).setDuration(250L).start();
        qicVar2.animate().alpha(0.0f).setDuration(250L).setListener(new eh8((Object) this, (Object) qicVar2, (byte) 23)).start();
    }

    public final void c(int i) {
        this.b.a = new oy8(R.raw.speaker_to_bt, i, i, true, null);
        this.b.b = new oy8(R.raw.speaker_to_bt, i, i, true, null);
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
        int L = gl.L(53.5f);
        int F = ug8.F(i);
        if (F != 0) {
            if (F == 1) {
                int i2 = this.c;
                if (i2 == 5 || i2 == 4) {
                    b(R.raw.camera_flip2, L, i, z);
                    z3 = true;
                } else if (i2 != 2) {
                    this.b.c = new oy8(R.raw.camera_flip2, L, L, true, null);
                    qic qicVar = this.b;
                    qicVar.c.M(qicVar);
                }
            } else if (F != 2) {
                if (F == 3) {
                    int i3 = this.c;
                    if (i3 == 5) {
                        qic qicVar2 = this.b;
                        z3 = z == qicVar2.w;
                        oy8 oy8Var = z ? qicVar2.b : qicVar2.a;
                        oy8Var.M(qicVar2);
                        oy8Var.u0 = new mic(this, L, (byte) 1);
                        oy8Var.start();
                    } else if (i3 == 2) {
                        b(R.raw.bt_to_speaker, L, i, z);
                        z3 = true;
                    } else if (i3 != 4) {
                        a(L);
                    }
                } else if (F == 4) {
                    int i4 = this.c;
                    if (i4 == 4) {
                        qic qicVar3 = this.b;
                        z3 = z == qicVar3.w;
                        oy8 oy8Var2 = z ? qicVar3.b : qicVar3.a;
                        oy8Var2.M(qicVar3);
                        oy8Var2.u0 = new mic(this, L, (byte) 0);
                        oy8Var2.start();
                    } else if (i4 == 2) {
                        b(R.raw.speaker_to_bt, L, i, z);
                        z3 = true;
                    } else if (i4 != 5) {
                        c(L);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new oy8(R.raw.video_stop, L, L, true, null);
                this.b.b = new oy8(R.raw.video_stop, L, L, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                qic qicVar4 = this.b;
                qicVar4.b.M(qicVar4);
            }
            if (!z3) {
                this.b.a(i, z, (this.c == 0 || z2) ? false : true);
            }
            int F2 = ug8.F(i);
            M0 = F2 == 0 ? F2 != 1 ? F2 != 2 ? F2 != 3 ? F2 != 4 ? "" : k96.M0(2131742997, null) : k96.M0(2131743261, null) : z ? k96.M0(2131742996, null) : k96.M0(2131742995, null) : k96.M0(2131743164, null) : z ? k96.M0(2131742988, null) : k96.M0(2131743051, null);
            setContentDescription(M0);
            textView = this.d;
            visibility = textView.getVisibility();
            textView2 = this.e;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(M0);
                textView2.setText(M0);
            } else if (textView2.getText().equals(M0) || !textView.getText().equals(M0)) {
                textView.animate().alpha(0.0f).translationY(-gl.L(4.0f)).setDuration(140L).setListener(new eh8(this, M0, (byte) 22)).start();
                textView2.setText(M0);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(gl.L(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new iab(this, (byte) 24)).start();
            }
            this.c = i;
        }
        if (this.c != 1) {
            this.b.a = new oy8(R.raw.call_mute, L, L, true, null);
            this.b.b = new oy8(R.raw.call_mute, L, L, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            qic qicVar5 = this.b;
            qicVar5.b.M(qicVar5);
        }
        z3 = false;
        if (!z3) {
        }
        int F22 = ug8.F(i);
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
        textView.animate().alpha(0.0f).translationY(-gl.L(4.0f)).setDuration(140L).setListener(new eh8(this, M0, (byte) 22)).start();
        textView2.setText(M0);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(gl.L(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new iab(this, (byte) 24)).start();
        this.c = i;
    }

    public void setOnBtnClickedListener(pic picVar) {
        this.b.setOnBtnClickedListener(picVar);
    }
}
