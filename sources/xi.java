// default package

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xi extends ViewOutlineProvider {
    public final /* synthetic */ byte a;

    public /* synthetic */ xi(byte b) {
        this.a = b;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), gl.L(6.0f) + view.getMeasuredHeight(), gl.L(6.0f));
                break;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), gl.L(29.0f) + view.getHeight(), gl.L(29.0f));
                break;
            case 2:
                int i = gl.u;
                outline.setOval(0, 0, i, i);
                break;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gl.L(18.0f));
                break;
            case 4:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gl.L(4.0f));
                break;
            case 5:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 6:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 7:
                outline.setRoundRect(gl.L(1.0f), gl.L(1.0f), view.getMeasuredWidth() - gl.L(1.0f), view.getMeasuredHeight() - gl.L(1.0f), gl.L(6.0f));
                break;
            case 8:
                outline.setOval(0, 0, gl.L(56.0f), gl.L(56.0f));
                break;
            case 9:
                outline.setOval(0, 0, gl.L(56.0f), gl.L(56.0f));
                break;
            case 10:
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
                if (imageReceiver != null) {
                    int[] z = imageReceiver.z();
                    int i2 = 0;
                    for (int i3 = 0; i3 < 4; i3++) {
                        i2 = Math.max(i2, z[i3]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i2);
                    break;
                } else {
                    int i4 = gl.u;
                    outline.setOval(0, 0, i4, i4);
                    break;
                }
            case 11:
                outline.setOval(0, 0, gl.L(120.0f), gl.L(120.0f));
                break;
            case 12:
                float L = gl.L(12.0f);
                outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + L), L);
                break;
            case 13:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), gl.L(12.0f));
                break;
            case 14:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gl.L(22.0f));
                break;
            case 15:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gl.L(22.0f));
                break;
            case 16:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gl.L(22.0f));
                break;
            case 17:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gl.L(22.0f));
                break;
            case 18:
                outline.setRoundRect(0, gl.L(50.0f), view.getWidth(), gl.L(24.0f) + view.getHeight(), gl.L(24.0f));
                break;
            case 19:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), gl.L(6.0f));
                break;
            case 20:
                outline.setRoundRect(0, 0, gl.L(24.0f) + view.getWidth(), view.getHeight(), gl.L(24.0f));
                break;
            case 21:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 22:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
                break;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / view.getScaleX()) * gl.L(4.0f));
                break;
        }
    }
}
