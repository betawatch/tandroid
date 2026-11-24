// default package

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wa8 extends Transition {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.R1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.U1.getPendingMarginTopDiff()));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.Y) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.Z.getPendingMarginTopDiff()));
                    break;
                }
                break;
            default:
                transitionValues.values.put("start", Boolean.FALSE);
                x2b x2bVar = (x2b) obj;
                transitionValues.values.put("offset", Integer.valueOf(x2bVar.b.getTop() + x2bVar.Y1));
                break;
        }
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                View view = transitionValues.view;
                ta8 ta8Var = ((PhotoViewer) obj).U1;
                if (view == ta8Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(ta8Var.getScrollY()));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                View view2 = transitionValues.view;
                ta8 ta8Var2 = ((SecretMediaViewer) obj).Z;
                if (view2 == ta8Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(ta8Var2.getScrollY()));
                    break;
                }
                break;
            default:
                transitionValues.values.put("start", Boolean.TRUE);
                x2b x2bVar = (x2b) obj;
                transitionValues.values.put("offset", Integer.valueOf(x2bVar.b.getTop() + x2bVar.Y1));
                break;
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        byte b = this.a;
        byte b2 = 5;
        Object obj = this.b;
        byte b3 = 1;
        byte b4 = 0;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.U1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new va8(this, b4));
                    ofInt.addUpdateListener(new fx7(this, b2));
                    return ofInt;
                }
                if (transitionValues2.view != photoViewer.R1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(photoViewer.R1, (Property<hb8, Float>) View.TRANSLATION_Y, 0.0f, intValue);
                ofFloat.addListener(new va8(this, b3));
                return ofFloat;
            case 1:
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new p29(this, (byte) 11));
                return ofFloat2;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.Z) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new jw9(this, b4));
                    ofInt2.addUpdateListener(new p29(this, (byte) 16));
                    return ofInt2;
                }
                if (transitionValues2.view != secretMediaViewer.Y || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(secretMediaViewer.Y, (Property<hb8, Float>) View.TRANSLATION_Y, 0.0f, intValue2);
                ofFloat3.addListener(new jw9(this, b3));
                return ofFloat3;
            default:
                int i = ((x2b) obj).Y1;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat4.setDuration(250L);
                ofFloat4.addUpdateListener(new bo(this, intValue3, i, b2));
                return ofFloat4;
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
