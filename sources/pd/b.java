package pd;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
