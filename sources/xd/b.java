package xd;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public interface b extends a {
    Object call(Object... objArr);

    Object callBy(Map map);

    List getParameters();

    h getReturnType();

    List getTypeParameters();

    i getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();
}
